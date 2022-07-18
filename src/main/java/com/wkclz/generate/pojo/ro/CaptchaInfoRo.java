package com.wkclz.generate.pojo.ro;

import lombok.Data;

/**
 * @Description
 * @Author ZengDongfang
 * @Date 2022/7/18 23:27
 */
@Data
public class CaptchaInfoRo {

    private Long pid;

    private String  username;

    private String  password;

    private String messageId;

    private String captcha;

}
