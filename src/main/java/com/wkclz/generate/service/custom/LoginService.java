package com.wkclz.generate.service.custom;

import com.wkclz.auth.entity.UserInfo;
import com.wkclz.auth.helper.AliveTimeHelper;
import com.wkclz.auth.entity.User;
import com.wkclz.auth.entity.UserAuth;
import com.wkclz.auth.helper.AuthHelper;
import com.wkclz.common.emuns.ResultStatus;
import com.wkclz.common.entity.Result;
import com.wkclz.common.exception.BizException;
import com.wkclz.common.utils.SecretUtil;
import com.wkclz.common.utils.ValidateCode;
import com.wkclz.generate.constant.GenConstant;
import com.wkclz.generate.dao.CasUserMapper;
import com.wkclz.generate.pojo.entity.CasLoginLog;
import com.wkclz.generate.pojo.entity.CasUser;
import com.wkclz.generate.pojo.ro.CaptchaInfoRo;
import com.wkclz.generate.pojo.vo.VerifyCode;
import com.wkclz.generate.service.core.CasLoginLogService;
import com.wkclz.generate.service.core.CasUserService;
import com.wkclz.mybatis.base.BaseService;
import com.wkclz.spring.helper.IpHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author ZengDongfang
 * @Date 2022/7/17 14:50
 */
@Service
@Slf4j
public class LoginService extends BaseService<CasUser, CasUserMapper> {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private CasUserService casUserService;

    @Autowired
    private CasLoginLogService casLoginLogService;

    @Autowired
    private AuthHelper authHelper;


    public Result<VerifyCode> getVerifyCode(VerifyCode vc) {
        String messageId = SecretUtil.getKey();
        String code = ValidateCode.generateTextCode(5, 4, (String) null);
        vc.setMessageId(messageId);
        stringRedisTemplate.opsForValue().set(GenConstant.IMAGE_PREFIX + messageId,
            code.toLowerCase(), 180L, TimeUnit.SECONDS);
        BufferedImage bim = ValidateCode.generateImageCode(code, 90, 30, 3,
            true, Color.WHITE, Color.BLACK, (Color) null);

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            ImageIO.write(bim, "jpg", outputStream);
            String picture = "data:image/jpg;base64," + Base64.getEncoder()
                .encodeToString(outputStream.toByteArray());
            vc.setPicture(picture);
        } catch (Exception e) {
            log.error(e.getMessage());
            return Result.error(e.getMessage());
        }
        return Result.data(vc);
    }

    public Result<Map<String, String>> publicSsoUserTokenLogin(String tempToken) {

        String token = stringRedisTemplate.boundValueOps(tempToken).get();
        if (StringUtils.isBlank(token)) {
            throw BizException.error(ResultStatus.TOKEN_ERROR);
        }
        stringRedisTemplate.delete(tempToken);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        return new Result<>(tokenMap);
    }

    public Result<Map<String, String>> userLogin(HttpServletRequest req, HttpServletResponse rep, CaptchaInfoRo model) {
        Result result = new Result();
        String username = model.getUsername();
        if (StringUtils.isEmpty(username)){
            return result.setError("username can not be bull");
        }

        CasUser casUser = new CasUser();


        CasLoginLog log = new CasLoginLog();
        log.setLoginName(username);
        casUser.setUsername(username);
        String password = model.getPassword();
        if (StringUtils.isBlank(password)){
            result.setError("Password can not be null");
            return result;
        }

        String ip = IpHelper.getOriginIp(req);
        log.setLoginIp(ip);
        log.setLoginTime(new Date());

        // ???????????????
        casUser = casUserService.get(casUser);
        if (casUser == null){

            // TODO ??????????????????????????????????????????????????????????????????????????????????????????????????????

            // ????????????????????????
            log.setLoginStatus(0);
            log.setReason("??????????????????");
            casLoginLogService.insert(log);

            // ?????????????????????????????????????????????
            return result.setMoreRemind(ResultStatus.USERNAME_PASSWORD_ERROR);
        }

        // ??????????????????????????????
        if (StringUtils.isNotBlank(model.getMessageId()) && StringUtils.isNotBlank(model.getCaptcha())){
            String serverCaptcha = stringRedisTemplate.opsForValue()
                .get(GenConstant.IMAGE_PREFIX + model.getMessageId());
            if (serverCaptcha == null || !serverCaptcha.equalsIgnoreCase(model.getCaptcha())) {
                return result.setMoreRemind(ResultStatus.CAPTCHA_ERROR);
            }
        }

        // ????????????
        if( casUser.getPassword() == null || casUser.getSalt() == null
            || !casUser.getPassword().equals(SecretUtil.getEncryptPassword(password,casUser.getSalt())) ){

            // ????????????????????????
            log.setLoginStatus(0);
            log.setReason("????????????");
            casLoginLogService.insert(log);


            casUserService.updateAll(casUser);

            // ?????????????????????????????????????????????
            return result.setMoreRemind(ResultStatus.USERNAME_PASSWORD_ERROR);
        }


        // ???????????????????????????????????????????????????session?????????
        authHelper.invalidateSession(req, rep);
        User userInfo = getLoginUserInfo(req, casUser.getId(), log);
        if (userInfo == null) {
            return Result.remind(log.getReason());
        }
        Map<String, String> tokenMap = authHelper.setUser(req, userInfo);

        return result.setData(tokenMap);
    }


    /**
     * ??????session
     *
     * @param req
     * @param authId
     * @param log
     * @return
     */
    public User getLoginUserInfo(HttpServletRequest req, Long authId, CasLoginLog log) {

        User user;

        // ?????????????????????
        String token = null;
        User session = authHelper.getUserIfLogin();
        if (session != null) {
            user = session;
            if (user.getToken() != null) {
                token = user.getToken();
            }
        }

        String ip = IpHelper.getOriginIp(req);
        CasUser auth = casUserService.get(authId);

        // session ??????
        // ???????????????, ?????????????????? token ?????????????????????????????? session????????? log ?????????token ????????????
        if (token == null) {
            token = SecretUtil.getKey();
        }

        user = new User();
        user.setUserId(auth.getUserId());
        auth.setSalt(null);

        UserAuth userAuth = new UserAuth();
        BeanUtils.copyProperties(auth, userAuth);
        userAuth.setPassword(null);
        userAuth.setSalt(null);
        user.setUserAuth(userAuth);

        user.setToken(token);
        user.setIp(ip);
        user.setAuthId(auth.getId());
        user.setLoginTimes((user.getLoginTimes() == null ? 0 : user.getLoginTimes()) + 1);

        user.setUsername(auth.getUsername());


        if (user.getUserId() != null) {
            CasUser casUser = casUserService.get(auth.getUserId());
            if (casUser == null) {
                log.setUserId(user.getUserId());
                log.setLoginStatus(0);
                log.setReason("??????????????????????????????????????????");
                casLoginLogService.insert(log);
                return null;
            }
            if (casUser.getStatus() != 1 ) {
                log.setUserId(user.getUserId());
                log.setLoginStatus(0);
                log.setReason("???????????????????????????????????????");
                casLoginLogService.insert(log);
                return null;
            }

            UserInfo userInfo = new UserInfo();
            BeanUtils.copyProperties(casUser, userInfo);
            user.setUserInfo(userInfo);
            if (StringUtils.isBlank(user.getUsername())) {
                user.setUsername(casUser.getNickName());
            }

            // ??????????????????????????????  user ??????
            if (session == null) {
                casUserService.updateAll(casUser);
            }

        }

        // ???????????????????????? update ??????
        if (StringUtils.isNotBlank(auth.getPassword())) {
            auth.setPassword("******");
        }

        // ????????????????????????????????????????????????????????????????????????
        if (log != null) {
            log.setUserId(user.getUserId());
            log.setLoginStatus(1);
            log.setReason("success");
            casLoginLogService.insert(log);
        }

        return user;
    }
}
