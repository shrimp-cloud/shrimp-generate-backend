package com.wkclz.generate.rest.custom.biz;

import com.wkclz.common.entity.Result;
import com.wkclz.generate.pojo.ro.CaptchaInfoRo;
import com.wkclz.generate.pojo.vo.VerifyCode;
import com.wkclz.generate.rest.custom.Routes;
import com.wkclz.generate.service.custom.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author ZengDongfang
 * @Date 2022/7/17 14:44
 */
@RestController
public class LoginRest {

    @Autowired
    private LoginService loginService;

    /**
     * @api {post} /public/captcha/picture 1.0 login-图片验证码
     * @apiGroup LOGIN
     *
     * @apiVersion 0.0.1
     * @apiDescription login-图片验证码
     *
     * @apiParam {String} [messageId] <code>body</code>信息ID【非必填】
     * @apiParam {String} [picture] <code>body</code>图片编码【非必填】
     *
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *         "messageId":"xxxxxxxxxxxxxxxxxxxx",
     *         "picture":"xxxxxxxxxxxxxxxxxxxx"
     *     }
     * }
     */
    @PostMapping(Routes.LOGIN_CAPTCHA_PICTURE)
    public Result<VerifyCode> getVerifyCode(@RequestBody VerifyCode vc) {
        return loginService.getVerifyCode(vc);
    }



    /**
     * @api {GET} /login/public/user/token/login 1.1 login-使用临时token登录
     * @apiGroup LOGIN
     * @apiVersion 0.0.1
     * @apiDescription 1.2 login-使用临时token登录
     * @apiSuccess {String} token 原token
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *         "token":"xxxxxxxxxxxxxxxxxxxx"
     *     }
     * }
     */
    @GetMapping(Routes.LOGIN_USER_TOKEN_TMP)
    public Result<Map<String, String>> publicSsoUserTokenLogin(@RequestParam("token") String tempToken) {
        return loginService.publicSsoUserTokenLogin(tempToken);
    }



    /**
     * @api {POST} /public/user/login 1.2 login-登录
     * @apiGroup LOGIN
     *
     * @apiVersion 0.0.1
     * @apiDescription 系统登录，username 自动识别为用户名
     *
     * @apiParam {String} username 用户名
     * @apiParam {String} password 密码
     * @apiParam {String} [messageId] 【上一次登录失败时必需】图片验证码id
     * @apiParam {String} [captcha] 【上一次登录失败时必需】图片验证码
     *
     * @apiParamExample {json} 请求样例：
     * {
     *     "username":"admin",
     *     "password":"admiPassword"
     * }
     *
     * @apiSuccess {String} token 用户token
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *      "code": 1,
     *      "data": {
     *          "token": "4fa26ce18d7c52b810c7f7eae61e719b"
     *      }
     * }
     */
    @PostMapping(Routes.LOGIN_USER)
    @Transactional(rollbackFor = Exception.class)
    public Result<Map<String, String>> userLogin(HttpServletRequest req, HttpServletResponse rep,
                                                 @RequestBody CaptchaInfoRo model){
        return loginService.userLogin(req,rep,model);
    }





}
