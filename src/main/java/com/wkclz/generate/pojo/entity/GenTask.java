package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_task (代码生成-任务) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenTask extends BaseEntity {

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
     * 模板ID
     */
    @Desc("模板ID")
    private Long tempId;

    /**
     * 任务名称
     */
    @Desc("任务名称")
    private String taskName;

    /**
     * 是否生成
     */
    @Desc("是否生成")
    private Integer needCreate;

    /**
     * 是否删除(本地模式有效)
     */
    @Desc("是否删除(本地模式有效)")
    private Integer needDelete;

    /**
     * 任务项目基本路径
     */
    @Desc("任务项目基本路径")
    private String projectBasePath;

    /**
     * 任务包路径
     */
    @Desc("任务包路径")
    private String packagePath;

    /**
     * 任务描述
     */
    @Desc("任务描述")
    private String taskDesc;

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


    public static GenTask copy(GenTask source, GenTask target){
        if (target == null ){ target = new GenTask();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserId(source.getUserId());
        target.setProjectId(source.getProjectId());
        target.setTempId(source.getTempId());
        target.setTaskName(source.getTaskName());
        target.setNeedCreate(source.getNeedCreate());
        target.setNeedDelete(source.getNeedDelete());
        target.setProjectBasePath(source.getProjectBasePath());
        target.setPackagePath(source.getPackagePath());
        target.setTaskDesc(source.getTaskDesc());
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

    public static GenTask copyIfNotNull(GenTask source, GenTask target){
        if (target == null ){ target = new GenTask();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserId() != null){ target.setUserId(source.getUserId()); }
        if (source.getProjectId() != null){ target.setProjectId(source.getProjectId()); }
        if (source.getTempId() != null){ target.setTempId(source.getTempId()); }
        if (source.getTaskName() != null){ target.setTaskName(source.getTaskName()); }
        if (source.getNeedCreate() != null){ target.setNeedCreate(source.getNeedCreate()); }
        if (source.getNeedDelete() != null){ target.setNeedDelete(source.getNeedDelete()); }
        if (source.getProjectBasePath() != null){ target.setProjectBasePath(source.getProjectBasePath()); }
        if (source.getPackagePath() != null){ target.setPackagePath(source.getPackagePath()); }
        if (source.getTaskDesc() != null){ target.setTaskDesc(source.getTaskDesc()); }
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


