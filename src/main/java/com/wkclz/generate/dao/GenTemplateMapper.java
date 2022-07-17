package com.wkclz.generate.dao;

import com.wkclz.mybatis.base.BaseMapper;
import com.wkclz.generate.pojo.entity.GenTemplate;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_template (代码生成-模板) DAO 接口，代码重新生成不覆盖
 */

@Mapper
public interface GenTemplateMapper extends BaseMapper<GenTemplate> {

    // 示例查询,可删除
    Integer example();

}

