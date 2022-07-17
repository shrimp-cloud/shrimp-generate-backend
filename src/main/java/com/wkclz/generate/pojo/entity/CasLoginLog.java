package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_login_log (登录日志) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class CasLoginLog extends BaseEntity {

    /**
     * ID
     */
    @Desc("ID")
    private Long id;

    /**
     * 登录的用户ID【密码错时为0】
     */
    @Desc("登录的用户ID【密码错时为0】")
    private Long userId;

    /**
     * 登录名
     */
    @Desc("登录名")
    private String loginName;

    /**
     * 登录IP
     */
    @Desc("登录IP")
    private String loginIp;

    /**
     * 登录时间
     */
    @Desc("登录时间")
    private Date loginTime;

    /**
     * 登录状态【1:成功，0：失败】
     */
    @Desc("登录状态【1:成功，0：失败】")
    private Integer loginStatus;

    /**
     * 登录失败原因
     */
    @Desc("登录失败原因")
    private String reason;

    /**
     * 排序
     */
    @Desc("排序")
    private Integer sort;

    /**
     * 创建时间
     */
    @Desc("创建时间")
    private Date createTime;

    /**
     * 创建人
     */
    @Desc("创建人")
    private Long createBy;

    /**
     * 更新时间
     */
    @Desc("更新时间")
    private Date updateTime;

    /**
     * 更新人
     */
    @Desc("更新人")
    private Long updateBy;

    /**
     * 备注
     */
    @Desc("备注")
    private String comments;

    /**
     * 版本号
     */
    @Desc("版本号")
    private Integer version;

    /**
     * status
     */
    @Desc("status")
    private Integer status;


    public static CasLoginLog copy(CasLoginLog source, CasLoginLog target){
        if (target == null ){ target = new CasLoginLog();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserId(source.getUserId());
        target.setLoginName(source.getLoginName());
        target.setLoginIp(source.getLoginIp());
        target.setLoginTime(source.getLoginTime());
        target.setLoginStatus(source.getLoginStatus());
        target.setReason(source.getReason());
        target.setSort(source.getSort());
        target.setCreateTime(source.getCreateTime());
        target.setCreateBy(source.getCreateBy());
        target.setUpdateTime(source.getUpdateTime());
        target.setUpdateBy(source.getUpdateBy());
        target.setComments(source.getComments());
        target.setVersion(source.getVersion());
        target.setStatus(source.getStatus());
        return target;
    }

    public static CasLoginLog copyIfNotNull(CasLoginLog source, CasLoginLog target){
        if (target == null ){ target = new CasLoginLog();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserId() != null){ target.setUserId(source.getUserId()); }
        if (source.getLoginName() != null){ target.setLoginName(source.getLoginName()); }
        if (source.getLoginIp() != null){ target.setLoginIp(source.getLoginIp()); }
        if (source.getLoginTime() != null){ target.setLoginTime(source.getLoginTime()); }
        if (source.getLoginStatus() != null){ target.setLoginStatus(source.getLoginStatus()); }
        if (source.getReason() != null){ target.setReason(source.getReason()); }
        if (source.getSort() != null){ target.setSort(source.getSort()); }
        if (source.getCreateTime() != null){ target.setCreateTime(source.getCreateTime()); }
        if (source.getCreateBy() != null){ target.setCreateBy(source.getCreateBy()); }
        if (source.getUpdateTime() != null){ target.setUpdateTime(source.getUpdateTime()); }
        if (source.getUpdateBy() != null){ target.setUpdateBy(source.getUpdateBy()); }
        if (source.getComments() != null){ target.setComments(source.getComments()); }
        if (source.getVersion() != null){ target.setVersion(source.getVersion()); }
        if (source.getStatus() != null){ target.setStatus(source.getStatus()); }
        return target;
    }

}


