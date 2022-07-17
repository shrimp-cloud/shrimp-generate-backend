package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_database (代码生成-数据库) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GenDatabase extends BaseEntity {

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
     * 主机名
     */
    @Desc("主机名")
    private String databaseHost;

    /**
     * 数据库类型
     */
    @Desc("数据库类型")
    private String databaseType;

    /**
     * 端口
     */
    @Desc("端口")
    private Integer databasePort;

    /**
     * 数据库名称
     */
    @Desc("数据库名称")
    private String databaseName;

    /**
     * 数据库用户名
     */
    @Desc("数据库用户名")
    private String username;

    /**
     * 数据库密码
     */
    @Desc("数据库密码")
    private String password;

    /**
     * 表前缀
     */
    @Desc("表前缀")
    private String prefix;

    /**
     * 保留表前缀
     */
    @Desc("保留表前缀")
    private Integer retainPrifx;

    /**
     * 忽略的表,英文逗号分隔
     */
    @Desc("忽略的表,英文逗号分隔")
    private String ignoreTables;

    /**
     * 忽略的字段,英文逗号分隔
     */
    @Desc("忽略的字段,英文逗号分隔")
    private String ignoreCloumns;

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


    public static GenDatabase copy(GenDatabase source, GenDatabase target){
        if (target == null ){ target = new GenDatabase();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserId(source.getUserId());
        target.setDatabaseHost(source.getDatabaseHost());
        target.setDatabaseType(source.getDatabaseType());
        target.setDatabasePort(source.getDatabasePort());
        target.setDatabaseName(source.getDatabaseName());
        target.setUsername(source.getUsername());
        target.setPassword(source.getPassword());
        target.setPrefix(source.getPrefix());
        target.setRetainPrifx(source.getRetainPrifx());
        target.setIgnoreTables(source.getIgnoreTables());
        target.setIgnoreCloumns(source.getIgnoreCloumns());
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

    public static GenDatabase copyIfNotNull(GenDatabase source, GenDatabase target){
        if (target == null ){ target = new GenDatabase();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserId() != null){ target.setUserId(source.getUserId()); }
        if (source.getDatabaseHost() != null){ target.setDatabaseHost(source.getDatabaseHost()); }
        if (source.getDatabaseType() != null){ target.setDatabaseType(source.getDatabaseType()); }
        if (source.getDatabasePort() != null){ target.setDatabasePort(source.getDatabasePort()); }
        if (source.getDatabaseName() != null){ target.setDatabaseName(source.getDatabaseName()); }
        if (source.getUsername() != null){ target.setUsername(source.getUsername()); }
        if (source.getPassword() != null){ target.setPassword(source.getPassword()); }
        if (source.getPrefix() != null){ target.setPrefix(source.getPrefix()); }
        if (source.getRetainPrifx() != null){ target.setRetainPrifx(source.getRetainPrifx()); }
        if (source.getIgnoreTables() != null){ target.setIgnoreTables(source.getIgnoreTables()); }
        if (source.getIgnoreCloumns() != null){ target.setIgnoreCloumns(source.getIgnoreCloumns()); }
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


