package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.GenAuthMapper;
import com.wkclz.generate.pojo.entity.GenAuth;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_auth (代码生成-授权) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class GenAuthService extends BaseService<GenAuth, GenAuthMapper> {

    // 示例方法，可删除
    public Integer example(){
        return mapper.example();
    }

}

