package com.wkclz.generate.pojo.dto;

import com.wkclz.generate.pojo.entity.GenTask;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_task (代码生成-任务) 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenTaskDto extends GenTask {




    /**
     * entity 转 Dto
     * @param source
     * @return
     */
    public static GenTaskDto copy(GenTask source){
        GenTaskDto target = new GenTaskDto();
        GenTask.copy(source, target);
        return target;
    }
}

