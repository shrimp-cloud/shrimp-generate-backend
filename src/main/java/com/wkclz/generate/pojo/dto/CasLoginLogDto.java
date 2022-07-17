package com.wkclz.generate.pojo.dto;

import com.wkclz.generate.pojo.entity.CasLoginLog;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_login_log (登录日志) 数据库实例扩展，代码重新生成不覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class CasLoginLogDto extends CasLoginLog {




    /**
     * entity 转 Dto
     * @param source
     * @return
     */
    public static CasLoginLogDto copy(CasLoginLog source){
        CasLoginLogDto target = new CasLoginLogDto();
        CasLoginLog.copy(source, target);
        return target;
    }
}

