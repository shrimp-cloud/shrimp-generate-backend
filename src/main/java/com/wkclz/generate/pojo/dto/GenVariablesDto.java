package com.wkclz.generate.pojo.dto;

import com.wkclz.generate.pojo.entity.GenVariables;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_variables (代码生成-变量) 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenVariablesDto extends GenVariables {




    /**
     * entity 转 Dto
     * @param source
     * @return
     */
    public static GenVariablesDto copy(GenVariables source){
        GenVariablesDto target = new GenVariablesDto();
        GenVariables.copy(source, target);
        return target;
    }
}

