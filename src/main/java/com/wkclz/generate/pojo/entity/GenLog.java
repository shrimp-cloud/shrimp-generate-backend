package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_log (代码生成-日志) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenLog extends BaseEntity {

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
     * 生成路径
     */
    @Desc("生成路径")
    private String genPath;

    /**
     * 开始时间
     */
    @Desc("开始时间")
    private Date startTime;

    /**
     * 结束时间
     */
    @Desc("结束时间")
    private Date endTime;

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


    public static GenLog copy(GenLog source, GenLog target){
        if (target == null ){ target = new GenLog();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserId(source.getUserId());
        target.setProjectId(source.getProjectId());
        target.setAuthCode(source.getAuthCode());
        target.setGenPath(source.getGenPath());
        target.setStartTime(source.getStartTime());
        target.setEndTime(source.getEndTime());
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

    public static GenLog copyIfNotNull(GenLog source, GenLog target){
        if (target == null ){ target = new GenLog();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserId() != null){ target.setUserId(source.getUserId()); }
        if (source.getProjectId() != null){ target.setProjectId(source.getProjectId()); }
        if (source.getAuthCode() != null){ target.setAuthCode(source.getAuthCode()); }
        if (source.getGenPath() != null){ target.setGenPath(source.getGenPath()); }
        if (source.getStartTime() != null){ target.setStartTime(source.getStartTime()); }
        if (source.getEndTime() != null){ target.setEndTime(source.getEndTime()); }
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


