package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_project (代码生成-项目) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenProject extends BaseEntity {

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
     * 数据库ID
     */
    @Desc("数据库ID")
    private Long databaseId;

    /**
     * 模块名
     */
    @Desc("模块名")
    private String moduleName;

    /**
     * 项目名称
     */
    @Desc("项目名称")
    private String projectName;

    /**
     * 项目说明
     */
    @Desc("项目说明")
    private String projectDesc;

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


    public static GenProject copy(GenProject source, GenProject target){
        if (target == null ){ target = new GenProject();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserId(source.getUserId());
        target.setDatabaseId(source.getDatabaseId());
        target.setModuleName(source.getModuleName());
        target.setProjectName(source.getProjectName());
        target.setProjectDesc(source.getProjectDesc());
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

    public static GenProject copyIfNotNull(GenProject source, GenProject target){
        if (target == null ){ target = new GenProject();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserId() != null){ target.setUserId(source.getUserId()); }
        if (source.getDatabaseId() != null){ target.setDatabaseId(source.getDatabaseId()); }
        if (source.getModuleName() != null){ target.setModuleName(source.getModuleName()); }
        if (source.getProjectName() != null){ target.setProjectName(source.getProjectName()); }
        if (source.getProjectDesc() != null){ target.setProjectDesc(source.getProjectDesc()); }
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


