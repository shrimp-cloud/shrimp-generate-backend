package com.wkclz.generate.pojo.dto;

import lombok.Data;

/**
 * @Description
 * @Author ZengDongfang
 * @Date 2022/7/17 14:48
 */
@Data
public class VerificationCodeDto {

    private String code;

    private byte[] imgBytes;

    private long expireTime;

}
