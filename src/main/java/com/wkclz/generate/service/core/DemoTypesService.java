package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.DemoTypesMapper;
import com.wkclz.generate.pojo.entity.DemoTypes;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description: Create by lz-gen
 * @Author wangkaicun
 * @table: demo_types (demo-全类型) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class DemoTypesService extends BaseService<DemoTypes, DemoTypesMapper> {

    // 示例方法，可删除
    public Integer example(){
        return  mapper.example();
    }

}

