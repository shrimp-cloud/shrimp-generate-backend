package com.wkclz.generate.service.custom;

import com.wkclz.auth.helper.AliveTimeHelper;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.SecretUtil;
import com.wkclz.common.utils.ValidateCode;
import com.wkclz.generate.constant.GenConstant;
import com.wkclz.generate.dao.CasUserMapper;
import com.wkclz.generate.pojo.entity.CasUser;
import com.wkclz.generate.pojo.vo.VerifyCode;
import com.wkclz.mybatis.base.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
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


    public Result<VerifyCode> getVerifyCode(VerifyCode vc) {
        String messageId = GenConstant.IMAGE_PREFIX + SecretUtil.getKey();
        String code = ValidateCode.generateTextCode(5, 4, (String) null);
        vc.setMessageId(messageId);
        stringRedisTemplate.opsForValue().set(messageId, code.toLowerCase(), 180L, TimeUnit.SECONDS);
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

    public Result<Map<String, String>> ssoUserTempToken(HttpServletRequest req) {
        String tempTokenKey = GenConstant.TOKEN_PREFIX + "temp_" + SecretUtil.getKey();
        String token = AliveTimeHelper.getToken(req);
        stringRedisTemplate.boundValueOps(tempTokenKey).set(token, 60L, TimeUnit.SECONDS);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("tempToken", tempTokenKey);
        return new Result<>(tokenMap);
    }
}
