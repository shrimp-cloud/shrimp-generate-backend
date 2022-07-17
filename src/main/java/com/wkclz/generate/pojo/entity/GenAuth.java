package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_auth (代码生成-授权) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenAuth extends BaseEntity {

    /**
     * ID
     */
    @Desc("ID")
    private Long id;

    /**
     * 用户ID
     */
    @Desc("用户ID")
    private Long userId;

    /**
     * 项目ID
     */
    @Desc("项目ID")
    private Long projectId;

    /**
     * 授权码
     */
    @Desc("授权码")
    private String authCode;

    /**
     * 生效时间
     */
    @Desc("生效时间")
    private Date enableTime;

    /**
     * 失效时间
     */
    @Desc("失效时间")
    private Date disableTime;

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


    public static GenAuth copy(GenAuth source, GenAuth target){
        if (target == null ){ target = new GenAuth();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserId(source.getUserId());
        target.setProjectId(source.getProjectId());
        target.setAuthCode(source.getAuthCode());
        target.setEnableTime(source.getEnableTime());
        target.setDisableTime(source.getDisableTime());
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

    public static GenAuth copyIfNotNull(GenAuth source, GenAuth target){
        if (target == null ){ target = new GenAuth();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserId() != null){ target.setUserId(source.getUserId()); }
        if (source.getProjectId() != null){ target.setProjectId(source.getProjectId()); }
        if (source.getAuthCode() != null){ target.setAuthCode(source.getAuthCode()); }
        if (source.getEnableTime() != null){ target.setEnableTime(source.getEnableTime()); }
        if (source.getDisableTime() != null){ target.setDisableTime(source.getDisableTime()); }
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


