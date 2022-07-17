package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.GenTemplateMapper;
import com.wkclz.generate.pojo.entity.GenTemplate;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_template (代码生成-模板) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class GenTemplateService extends BaseService<GenTemplate, GenTemplateMapper> {

    // 示例方法，可删除
    public Integer example(){
        return mapper.example();
    }

}

