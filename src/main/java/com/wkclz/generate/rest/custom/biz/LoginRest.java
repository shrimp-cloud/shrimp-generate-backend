package com.wkclz.generate.rest.custom.biz;

import com.wkclz.common.entity.Result;
import com.wkclz.generate.pojo.vo.VerifyCode;
import com.wkclz.generate.rest.custom.Routes;
import com.wkclz.generate.service.custom.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
     * @api {post} /login/captcha/picture 1.0 login-图片验证码
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
    @PostMapping(Routes.COMMON_CAPTCHA_PICTURE)
    public Result<VerifyCode> getVerifyCode(@RequestBody VerifyCode vc) {
        return loginService.getVerifyCode(vc);
    }

    /**
     * @api {GET} /login/user/temp/token 1.1 login-获取临时token
     * @apiGroup LOGIN
     * @apiVersion 0.0.1
     * @apiDescription login-获取临时token 前端需将
     * @apiSuccess {String} tempToken 临时token
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *         "tempToken":"xxxxxxxxxxxxxxxxxxxx"
     *     }
     * }
     */
    @GetMapping(Routes.SSO_USER_TEMP_TOKEN)
    public Result<Map<String, String>> ssoUserTempToken(HttpServletRequest req) {
        return loginService.ssoUserTempToken(req);
    }



}
