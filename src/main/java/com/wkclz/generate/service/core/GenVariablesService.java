package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.GenVariablesMapper;
import com.wkclz.generate.pojo.entity.GenVariables;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_variables (代码生成-变量) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class GenVariablesService extends BaseService<GenVariables, GenVariablesMapper> {

    // 示例方法，可删除
    public Integer example(){
        return mapper.example();
    }

}

