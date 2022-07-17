package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.GenLogMapper;
import com.wkclz.generate.pojo.entity.GenLog;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_log (代码生成-日志) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class GenLogService extends BaseService<GenLog, GenLogMapper> {

    // 示例方法，可删除
    public Integer example(){
        return mapper.example();
    }

}

