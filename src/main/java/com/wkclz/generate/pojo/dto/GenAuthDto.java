package com.wkclz.generate.pojo.dto;

import com.wkclz.generate.pojo.entity.GenAuth;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_auth (代码生成-授权) 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenAuthDto extends GenAuth {




    /**
     * entity 转 Dto
     * @param source
     * @return
     */
    public static GenAuthDto copy(GenAuth source){
        GenAuthDto target = new GenAuthDto();
        GenAuth.copy(source, target);
        return target;
    }
}

