package com.wkclz.generate.pojo.dto;

import com.wkclz.generate.pojo.entity.DemoTypes;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description: Create by lz-gen
 * @author: wangkaicun
 * @table: demo_types (demo-全类型) 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class DemoTypesDto extends DemoTypes {




    /**
     * model 转 Dto
     * @param source
     * @return
     */
    public static DemoTypesDto copy(DemoTypes source){
        DemoTypesDto target = new DemoTypesDto();
        DemoTypes.copy(source, target);
        return target;
    }
}

