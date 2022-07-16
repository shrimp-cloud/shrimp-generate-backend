package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.CasUser;
import com.wkclz.generate.service.core.CasUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_user (用户) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class CasUserRest {

    @Autowired
    private CasUserService casUserService;

    /**
     * @api {get} /cas/user/page 1. 用户-获取分页
     * @apiGroup CAS_USER
     *
     * @apiVersion 0.0.1
     * @apiDescription 用户-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {String} [userCode] <code>param</code>用户编码
     * @apiParam {String} [nickName] <code>param</code>昵称
     * @apiParam {String} [username] <code>param</code>用户名
     * @apiParam {String} [password] <code>param</code>密码（加密）
     * @apiParam {String} [salt] <code>param</code>密码加密散列值
     * @apiParam {Integer} [sort] <code>param</code>排序
     * @apiParam {Date} [createTime] <code>param</code>创建时间
     * @apiParam {Long} [createBy] <code>param</code>创建人
     * @apiParam {Date} [updateTime] <code>param</code>更新时间
     * @apiParam {Long} [updateBy] <code>param</code>更新人
     * @apiParam {String} [comments] <code>param</code>备注
     * @apiParam {Integer} [version] <code>param</code>版本号
     * @apiParam {Integer} [status] <code>param</code>status
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {String} [userCode] 用户编码
     * @apiSuccess {String} [nickName] 昵称
     * @apiSuccess {String} [username] 用户名
     * @apiSuccess {String} [password] 密码（加密）
     * @apiSuccess {String} [salt] 密码加密散列值
     * @apiSuccess {Integer} [sort] 排序
     * @apiSuccess {Date} [createTime] 创建时间
     * @apiSuccess {Long} [createBy] 创建人
     * @apiSuccess {Date} [updateTime] 更新时间
     * @apiSuccess {Long} [updateBy] 更新人
     * @apiSuccess {String} [comments] 备注
     * @apiSuccess {Integer} [version] 版本号
     * @apiSuccess {Integer} [status] status
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *         "rows": [
     *             {
     *                 "id": "id",
     *                 "userCode": "userCode",
     *                 "nickName": "nickName",
     *                 "username": "username",
     *                 "password": "password",
     *                 "salt": "salt",
     *                 "sort": "sort",
     *                 "createTime": "createTime",
     *                 "createBy": "createBy",
     *                 "updateTime": "updateTime",
     *                 "updateBy": "updateBy",
     *                 "comments": "comments",
     *                 "version": "version",
     *                 "status": "status",
     *             },
     *             ...
     *         ],
     *         "totalCount": 1,
     *         "totalPage": 1,
     *         "pageNo": 1,
     *         "pageSize": 10
     *     }
     * }
     *
     */
    @GetMapping("/cas/user/page")
    public Result casUserPage(CasUser entity){
        PageData<CasUser> casUsers = casUserService.page(entity);
        return Result.data(casUsers);
    }

    /**
     * @api {get} /cas/user/count 2. 用户-获取数量
     * @apiGroup CAS_USER
     *
     * @apiVersion 0.0.1
     * @apiDescription 用户-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {String} [userCode] <code>param</code>用户编码
     * @apiParam {String} [nickName] <code>param</code>昵称
     * @apiParam {String} [username] <code>param</code>用户名
     * @apiParam {String} [password] <code>param</code>密码（加密）
     * @apiParam {String} [salt] <code>param</code>密码加密散列值
     * @apiParam {Integer} [sort] <code>param</code>排序
     * @apiParam {Date} [createTime] <code>param</code>创建时间
     * @apiParam {Long} [createBy] <code>param</code>创建人
     * @apiParam {Date} [updateTime] <code>param</code>更新时间
     * @apiParam {Long} [updateBy] <code>param</code>更新人
     * @apiParam {String} [comments] <code>param</code>备注
     * @apiParam {Integer} [version] <code>param</code>版本号
     * @apiParam {Integer} [status] <code>param</code>status
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} count 统计结果
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *          "count":12
     *      }
     * }
     *
     */
    @GetMapping("/cas/user/count")
    public Result casUserCount(CasUser entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(casUserService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /cas/user/info 3. 用户-获取详情
     * @apiGroup CAS_USER
     *
     * @apiVersion 0.0.1
     * @apiDescription 用户-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {String} [userCode] 用户编码
     * @apiSuccess {String} [nickName] 昵称
     * @apiSuccess {String} [username] 用户名
     * @apiSuccess {String} [password] 密码（加密）
     * @apiSuccess {String} [salt] 密码加密散列值
     * @apiSuccess {Integer} [sort] 排序
     * @apiSuccess {Date} [createTime] 创建时间
     * @apiSuccess {Long} [createBy] 创建人
     * @apiSuccess {Date} [updateTime] 更新时间
     * @apiSuccess {Long} [updateBy] 更新人
     * @apiSuccess {String} [comments] 备注
     * @apiSuccess {Integer} [version] 版本号
     * @apiSuccess {Integer} [status] status
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": {
     *          "id": "id",
     *          "userCode": "userCode",
     *          "nickName": "nickName",
     *          "username": "username",
     *          "password": "password",
     *          "salt": "salt",
     *          "sort": "sort",
     *          "createTime": "createTime",
     *          "createBy": "createBy",
     *          "updateTime": "updateTime",
     *          "updateBy": "updateBy",
     *          "comments": "comments",
     *          "version": "version",
     *          "status": "status",
     *     }
     * }
     *
     */
    @GetMapping("/cas/user/info")
    public Result casUserInfo(CasUser entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = casUserService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/user/new 4. 用户-新增信息
     * @apiGroup CAS_USER
     *
     * @apiVersion 0.0.1
     * @apiDescription 用户-新增信息
     *
     * @apiParam {String} [userCode] <code>body</code>用户编码
     * @apiParam {String} [nickName] <code>body</code>昵称
     * @apiParam {String} [username] <code>body</code>用户名
     * @apiParam {String} [password] <code>body</code>密码（加密）
     * @apiParam {String} [salt] <code>body</code>密码加密散列值
     * @apiParam {Integer} [sort] <code>body</code>排序
     * @apiParam {Date} [createTime] <code>body</code>创建时间
     * @apiParam {Long} [createBy] <code>body</code>创建人
     * @apiParam {Date} [updateTime] <code>body</code>更新时间
     * @apiParam {Long} [updateBy] <code>body</code>更新人
     * @apiParam {String} [comments] <code>body</code>备注
     * @apiParam {Integer} [version] <code>body</code>版本号
     * @apiParam {Integer} [status] <code>body</code>status
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "userCode": "userCode",
     *      "nickName": "nickName",
     *      "username": "username",
     *      "password": "password",
     *      "salt": "salt",
     *      "sort": "sort",
     *      "createTime": "createTime",
     *      "createBy": "createBy",
     *      "updateTime": "updateTime",
     *      "updateBy": "updateBy",
     *      "comments": "comments",
     *      "version": "version",
     *      "status": "status",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectEntity
     * }
     *
     */
    @PostMapping("/cas/user/new")
    @Transactional(rollbackFor = Exception.class)
    public Result casUserNew(@RequestBody CasUser entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = casUserService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/user/update 5. 用户-更新信息
     * @apiGroup CAS_USER
     *
     * @apiVersion 0.0.1
     * @apiDescription 用户-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {String} [userCode] <code>body</code>用户编码
     * @apiParam {String} [nickName] <code>body</code>昵称
     * @apiParam {String} [username] <code>body</code>用户名
     * @apiParam {String} [password] <code>body</code>密码（加密）
     * @apiParam {String} [salt] <code>body</code>密码加密散列值
     * @apiParam {Integer} [sort] <code>body</code>排序
     * @apiParam {Date} [createTime] <code>body</code>创建时间
     * @apiParam {Long} [createBy] <code>body</code>创建人
     * @apiParam {Date} [updateTime] <code>body</code>更新时间
     * @apiParam {Long} [updateBy] <code>body</code>更新人
     * @apiParam {String} [comments] <code>body</code>备注
     * @apiParam {Integer} [version] <code>body</code>版本号
     * @apiParam {Integer} [status] <code>body</code>status
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "id": "id",
     *      "userCode": "userCode",
     *      "nickName": "nickName",
     *      "username": "username",
     *      "password": "password",
     *      "salt": "salt",
     *      "sort": "sort",
     *      "createTime": "createTime",
     *      "createBy": "createBy",
     *      "updateTime": "updateTime",
     *      "updateBy": "updateBy",
     *      "comments": "comments",
     *      "version": "version",
     *      "status": "status",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectEntity
     * }
     *
     */
    @PostMapping("/cas/user/update")
    @Transactional(rollbackFor = Exception.class)
    public Result casUserUpdate(@RequestBody CasUser entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        casUserService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/user/save 6. 用户-保存信息
     * @apiGroup CAS_USER
     *
     * @apiVersion 0.0.1
     * @apiDescription 用户-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {String} [userCode] <code>body</code>用户编码
     * @apiParam {String} [nickName] <code>body</code>昵称
     * @apiParam {String} [username] <code>body</code>用户名
     * @apiParam {String} [password] <code>body</code>密码（加密）
     * @apiParam {String} [salt] <code>body</code>密码加密散列值
     * @apiParam {Integer} [sort] <code>body</code>排序
     * @apiParam {Date} [createTime] <code>body</code>创建时间
     * @apiParam {Long} [createBy] <code>body</code>创建人
     * @apiParam {Date} [updateTime] <code>body</code>更新时间
     * @apiParam {Long} [updateBy] <code>body</code>更新人
     * @apiParam {String} [comments] <code>body</code>备注
     * @apiParam {Integer} [version] <code>body</code>版本号
     * @apiParam {Integer} [status] <code>body</code>status
     *
     * @apiParamExample {json} 请求样例:
     * {
     *      "id": "id",
     *      "userCode": "userCode",
     *      "nickName": "nickName",
     *      "username": "username",
     *      "password": "password",
     *      "salt": "salt",
     *      "sort": "sort",
     *      "createTime": "createTime",
     *      "createBy": "createBy",
     *      "updateTime": "updateTime",
     *      "updateBy": "updateBy",
     *      "comments": "comments",
     *      "version": "version",
     *      "status": "status",
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": ObjectEntity
     * }
     *
     */
    @PostMapping("/cas/user/save")
    @Transactional(rollbackFor = Exception.class)
    public Result casUserSave(@RequestBody CasUser entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = casUserService.insert(entity);
            entity.setId(id);
        } else {
            CasUser oldEntity = casUserService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            CasUser.copyIfNotNull(entity, oldEntity);
            casUserService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/user/remove 7. 用户-删除【单个，批量】
     * @apiGroup CAS_USER
     *
     * @apiVersion 0.0.1
     * @apiDescription 用户-删除【单个，批量】
     *
     * @apiParam {Long} [id] <code>body</code> 主键 id
     * @apiParam {Long[]} [ids] <code>body</code> 主键 id组
     *
     * @apiParamExample {json} 请求样例:
     * {
     *     "id": 1,
     *     "ids": [1]
     * }
     *
     * @apiSuccessExample {json} 返回样例:
     * {
     *     "code": 1,
     *     "data": 1
     * }
     *
     */
    @PostMapping("/cas/user/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result casUserRemove(@RequestBody CasUser entity){
        Integer rt = casUserService.delete(entity);
        return Result.data(rt);
    }

}

