package com.wkclz.generate.dao;

import com.wkclz.mybatis.base.BaseMapper;
import com.wkclz.generate.pojo.entity.CasUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_user (用户) DAO 接口，代码重新生成不覆盖
 */

@Mapper
public interface CasUserMapper extends BaseMapper<CasUser> {

    // 示例查询,可删除
    Integer example();

}

