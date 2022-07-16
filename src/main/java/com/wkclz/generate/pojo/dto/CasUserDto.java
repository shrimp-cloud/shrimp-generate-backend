package com.wkclz.generate.pojo.dto;

import com.wkclz.generate.pojo.entity.CasUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_user (用户) 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class CasUserDto extends CasUser {




    /**
     * entity 转 Dto
     * @param source
     * @return
     */
    public static CasUserDto copy(CasUser source){
        CasUserDto target = new CasUserDto();
        CasUser.copy(source, target);
        return target;
    }
}

