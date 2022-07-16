package com.wkclz.generate.service.custom;

import com.wkclz.generate.dao.DemoTypesMapper;
import com.wkclz.generate.pojo.entity.DemoTypes;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.mybatis.base.PageHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 自定义 service, 可任意添加内容，可注入产 coreService
 * @Author wangkaicun
 */
 
@Service
public class DemoService {

    @Autowired
    private DemoTypesMapper demoTypesMapper;

    public PageData selectPage(DemoTypes demoTypes){
        return new PageHandle(demoTypes).page(demoTypesMapper.list(demoTypes));
    }

}

