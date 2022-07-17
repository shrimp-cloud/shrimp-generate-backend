package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.GenAuth;
import com.wkclz.generate.service.core.GenAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_auth (代码生成-授权) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class GenAuthRest {

    @Autowired
    private GenAuthService genAuthService;

    /**
     * @api {get} /gen/auth/page 1. 代码生成-授权-获取分页
     * @apiGroup GEN_AUTH
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-授权-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [projectId] <code>param</code>项目ID
     * @apiParam {String} [authCode] <code>param</code>授权码
     * @apiParam {Date} [enableTime] <code>param</code>生效时间
     * @apiParam {Date} [disableTime] <code>param</code>失效时间
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
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {Long} [projectId] 项目ID
     * @apiSuccess {String} [authCode] 授权码
     * @apiSuccess {Date} [enableTime] 生效时间
     * @apiSuccess {Date} [disableTime] 失效时间
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
     *                 "userId": "userId",
     *                 "projectId": "projectId",
     *                 "authCode": "authCode",
     *                 "enableTime": "enableTime",
     *                 "disableTime": "disableTime",
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
    @GetMapping("/gen/auth/page")
    public Result genAuthPage(GenAuth entity){
        PageData<GenAuth> genAuths = genAuthService.page(entity);
        return Result.data(genAuths);
    }

    /**
     * @api {get} /gen/auth/count 2. 代码生成-授权-获取数量
     * @apiGroup GEN_AUTH
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-授权-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [projectId] <code>param</code>项目ID
     * @apiParam {String} [authCode] <code>param</code>授权码
     * @apiParam {Date} [enableTime] <code>param</code>生效时间
     * @apiParam {Date} [disableTime] <code>param</code>失效时间
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
    @GetMapping("/gen/auth/count")
    public Result genAuthCount(GenAuth entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(genAuthService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /gen/auth/info 3. 代码生成-授权-获取详情
     * @apiGroup GEN_AUTH
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-授权-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {Long} [projectId] 项目ID
     * @apiSuccess {String} [authCode] 授权码
     * @apiSuccess {Date} [enableTime] 生效时间
     * @apiSuccess {Date} [disableTime] 失效时间
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
     *          "userId": "userId",
     *          "projectId": "projectId",
     *          "authCode": "authCode",
     *          "enableTime": "enableTime",
     *          "disableTime": "disableTime",
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
    @GetMapping("/gen/auth/info")
    public Result genAuthInfo(GenAuth entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = genAuthService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/auth/new 4. 代码生成-授权-新增信息
     * @apiGroup GEN_AUTH
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-授权-新增信息
     *
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
     * @apiParam {String} [authCode] <code>body</code>授权码
     * @apiParam {Date} [enableTime] <code>body</code>生效时间
     * @apiParam {Date} [disableTime] <code>body</code>失效时间
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
     *      "userId": "userId",
     *      "projectId": "projectId",
     *      "authCode": "authCode",
     *      "enableTime": "enableTime",
     *      "disableTime": "disableTime",
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
    @PostMapping("/gen/auth/new")
    @Transactional(rollbackFor = Exception.class)
    public Result genAuthNew(@RequestBody GenAuth entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = genAuthService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/auth/update 5. 代码生成-授权-更新信息
     * @apiGroup GEN_AUTH
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-授权-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
     * @apiParam {String} [authCode] <code>body</code>授权码
     * @apiParam {Date} [enableTime] <code>body</code>生效时间
     * @apiParam {Date} [disableTime] <code>body</code>失效时间
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
     *      "userId": "userId",
     *      "projectId": "projectId",
     *      "authCode": "authCode",
     *      "enableTime": "enableTime",
     *      "disableTime": "disableTime",
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
    @PostMapping("/gen/auth/update")
    @Transactional(rollbackFor = Exception.class)
    public Result genAuthUpdate(@RequestBody GenAuth entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        genAuthService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/auth/save 6. 代码生成-授权-保存信息
     * @apiGroup GEN_AUTH
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-授权-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
     * @apiParam {String} [authCode] <code>body</code>授权码
     * @apiParam {Date} [enableTime] <code>body</code>生效时间
     * @apiParam {Date} [disableTime] <code>body</code>失效时间
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
     *      "userId": "userId",
     *      "projectId": "projectId",
     *      "authCode": "authCode",
     *      "enableTime": "enableTime",
     *      "disableTime": "disableTime",
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
    @PostMapping("/gen/auth/save")
    @Transactional(rollbackFor = Exception.class)
    public Result genAuthSave(@RequestBody GenAuth entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = genAuthService.insert(entity);
            entity.setId(id);
        } else {
            GenAuth oldEntity = genAuthService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            GenAuth.copyIfNotNull(entity, oldEntity);
            genAuthService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/auth/remove 7. 代码生成-授权-删除【单个，批量】
     * @apiGroup GEN_AUTH
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-授权-删除【单个，批量】
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
    @PostMapping("/gen/auth/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result genAuthRemove(@RequestBody GenAuth entity){
        Integer rt = genAuthService.delete(entity);
        return Result.data(rt);
    }

}

