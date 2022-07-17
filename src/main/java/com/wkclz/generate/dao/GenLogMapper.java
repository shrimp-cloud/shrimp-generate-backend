package com.wkclz.generate.dao;

import com.wkclz.mybatis.base.BaseMapper;
import com.wkclz.generate.pojo.entity.GenLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_log (代码生成-日志) DAO 接口，代码重新生成不覆盖
 */

@Mapper
public interface GenLogMapper extends BaseMapper<GenLog> {

    // 示例查询,可删除
    Integer example();

}

