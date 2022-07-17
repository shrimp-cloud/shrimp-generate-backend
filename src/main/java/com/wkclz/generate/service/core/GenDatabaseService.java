package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.GenDatabaseMapper;
import com.wkclz.generate.pojo.entity.GenDatabase;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_database (代码生成-数据库) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class GenDatabaseService extends BaseService<GenDatabase, GenDatabaseMapper> {

    // 示例方法，可删除
    public Integer example(){
        return mapper.example();
    }

}

