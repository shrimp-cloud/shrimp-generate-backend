package com.wkclz.generate.pojo.entity;

import com.wkclz.common.annotation.Desc;
import com.wkclz.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Date;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_user (用户) 重新生成代码会覆盖
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class CasUser extends BaseEntity {

    /**
     * ID
     */
    @Desc("ID")
    private Long id;

    /**
     * 用户编码
     */
    @Desc("用户编码")
    private String userCode;

    /**
     * 昵称
     */
    @Desc("昵称")
    private String nickName;

    /**
     * 用户名
     */
    @Desc("用户名")
    private String username;

    /**
     * 密码（加密）
     */
    @Desc("密码（加密）")
    private String password;

    /**
     * 密码加密散列值
     */
    @Desc("密码加密散列值")
    private String salt;

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


    public static CasUser copy(CasUser source, CasUser target){
        if (target == null ){ target = new CasUser();}
        if (source == null){ return target; }
        target.setId(source.getId());
        target.setUserCode(source.getUserCode());
        target.setNickName(source.getNickName());
        target.setUsername(source.getUsername());
        target.setPassword(source.getPassword());
        target.setSalt(source.getSalt());
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

    public static CasUser copyIfNotNull(CasUser source, CasUser target){
        if (target == null ){ target = new CasUser();}
        if (source == null){ return target; }
        if (source.getId() != null){ target.setId(source.getId()); }
        if (source.getUserCode() != null){ target.setUserCode(source.getUserCode()); }
        if (source.getNickName() != null){ target.setNickName(source.getNickName()); }
        if (source.getUsername() != null){ target.setUsername(source.getUsername()); }
        if (source.getPassword() != null){ target.setPassword(source.getPassword()); }
        if (source.getSalt() != null){ target.setSalt(source.getSalt()); }
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


