package com.wkclz.generate.pojo.dto;

import com.wkclz.generate.pojo.entity.GenDatabase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_database (代码生成-数据库) 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenDatabaseDto extends GenDatabase {




    /**
     * entity 转 Dto
     * @param source
     * @return
     */
    public static GenDatabaseDto copy(GenDatabase source){
        GenDatabaseDto target = new GenDatabaseDto();
        GenDatabase.copy(source, target);
        return target;
    }
}

