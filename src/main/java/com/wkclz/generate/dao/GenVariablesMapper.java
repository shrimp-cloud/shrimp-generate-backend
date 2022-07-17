package com.wkclz.generate.dao;

import com.wkclz.mybatis.base.BaseMapper;
import com.wkclz.generate.pojo.entity.GenVariables;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_variables (代码生成-变量) DAO 接口，代码重新生成不覆盖
 */

@Mapper
public interface GenVariablesMapper extends BaseMapper<GenVariables> {

    // 示例查询,可删除
    Integer example();

}

