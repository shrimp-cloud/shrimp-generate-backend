package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.GenTaskMapper;
import com.wkclz.generate.pojo.entity.GenTask;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_task (代码生成-任务) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class GenTaskService extends BaseService<GenTask, GenTaskMapper> {

    // 示例方法，可删除
    public Integer example(){
        return mapper.example();
    }

}

