package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_template (代码生成-模板) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenTemplate extends BaseEntity {

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
     * 模板名称
     */
    @Desc("模板名称")
    private String ftlName;

    /**
     * 生成的文件后缀
     */
    @Desc("生成的文件后缀")
    private String fileSubfix;

    /**
     * 模板描述
     */
    @Desc("模板描述")
    private String ftlDesc;

    /**
     * 模板内容
     */
    @Desc("模板内容")
    private String tempContent;

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


    public static GenTemplate copy(GenTemplate source, GenTemplate target){
        if (target == null ){ target = new GenTemplate();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserId(source.getUserId());
        target.setFtlName(source.getFtlName());
        target.setFileSubfix(source.getFileSubfix());
        target.setFtlDesc(source.getFtlDesc());
        target.setTempContent(source.getTempContent());
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

    public static GenTemplate copyIfNotNull(GenTemplate source, GenTemplate target){
        if (target == null ){ target = new GenTemplate();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserId() != null){ target.setUserId(source.getUserId()); }
        if (source.getFtlName() != null){ target.setFtlName(source.getFtlName()); }
        if (source.getFileSubfix() != null){ target.setFileSubfix(source.getFileSubfix()); }
        if (source.getFtlDesc() != null){ target.setFtlDesc(source.getFtlDesc()); }
        if (source.getTempContent() != null){ target.setTempContent(source.getTempContent()); }
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


