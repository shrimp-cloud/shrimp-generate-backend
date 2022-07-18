package com.wkclz.generate.service.core;

import com.wkclz.generate.dao.CasLoginLogMapper;
import com.wkclz.generate.pojo.entity.CasLoginLog;
import com.wkclz.mybatis.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_login_log (登录日志) 单表服务类，代码重新生成不覆盖
 */
 
@Service
public class CasLoginLogService extends BaseService<CasLoginLog, CasLoginLogMapper> {


    public Integer increaseLoginTime(){
        return  mapper.increaseLoginTime();
    }
}

