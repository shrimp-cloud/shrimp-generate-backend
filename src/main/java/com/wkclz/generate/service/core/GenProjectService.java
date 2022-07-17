package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.GenProjectMapper;
import com.wkclz.generate.pojo.entity.GenProject;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_project (代码生成-项目) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class GenProjectService extends BaseService<GenProject, GenProjectMapper> {

    // 示例方法，可删除
    public Integer example(){
        return mapper.example();
    }

}

