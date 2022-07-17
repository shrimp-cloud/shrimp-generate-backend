package com.wkclz.generate.dao;

import com.wkclz.mybatis.base.BaseMapper;
import com.wkclz.generate.pojo.entity.GenDatabase;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_database (代码生成-数据库) DAO 接口，代码重新生成不覆盖
 */

@Mapper
public interface GenDatabaseMapper extends BaseMapper<GenDatabase> {

    // 示例查询,可删除
    Integer example();

}

