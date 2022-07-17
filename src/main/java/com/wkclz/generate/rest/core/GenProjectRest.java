package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.GenProject;
import com.wkclz.generate.service.core.GenProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_project (代码生成-项目) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class GenProjectRest {

    @Autowired
    private GenProjectService genProjectService;

    /**
     * @api {get} /gen/project/page 1. 代码生成-项目-获取分页
     * @apiGroup GEN_PROJECT
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-项目-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [databaseId] <code>param</code>数据库ID
     * @apiParam {String} [moduleName] <code>param</code>模块名
     * @apiParam {String} [projectName] <code>param</code>项目名称
     * @apiParam {String} [projectDesc] <code>param</code>项目说明
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
     * @apiSuccess {Long} [databaseId] 数据库ID
     * @apiSuccess {String} [moduleName] 模块名
     * @apiSuccess {String} [projectName] 项目名称
     * @apiSuccess {String} [projectDesc] 项目说明
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
     *                 "databaseId": "databaseId",
     *                 "moduleName": "moduleName",
     *                 "projectName": "projectName",
     *                 "projectDesc": "projectDesc",
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
    @GetMapping("/gen/project/page")
    public Result genProjectPage(GenProject entity){
        PageData<GenProject> genProjects = genProjectService.page(entity);
        return Result.data(genProjects);
    }

    /**
     * @api {get} /gen/project/count 2. 代码生成-项目-获取数量
     * @apiGroup GEN_PROJECT
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-项目-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [databaseId] <code>param</code>数据库ID
     * @apiParam {String} [moduleName] <code>param</code>模块名
     * @apiParam {String} [projectName] <code>param</code>项目名称
     * @apiParam {String} [projectDesc] <code>param</code>项目说明
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
    @GetMapping("/gen/project/count")
    public Result genProjectCount(GenProject entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(genProjectService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /gen/project/info 3. 代码生成-项目-获取详情
     * @apiGroup GEN_PROJECT
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-项目-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {Long} [databaseId] 数据库ID
     * @apiSuccess {String} [moduleName] 模块名
     * @apiSuccess {String} [projectName] 项目名称
     * @apiSuccess {String} [projectDesc] 项目说明
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
     *          "databaseId": "databaseId",
     *          "moduleName": "moduleName",
     *          "projectName": "projectName",
     *          "projectDesc": "projectDesc",
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
    @GetMapping("/gen/project/info")
    public Result genProjectInfo(GenProject entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = genProjectService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/project/new 4. 代码生成-项目-新增信息
     * @apiGroup GEN_PROJECT
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-项目-新增信息
     *
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [databaseId] <code>body</code>数据库ID
     * @apiParam {String} [moduleName] <code>body</code>模块名
     * @apiParam {String} [projectName] <code>body</code>项目名称
     * @apiParam {String} [projectDesc] <code>body</code>项目说明
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
     *      "databaseId": "databaseId",
     *      "moduleName": "moduleName",
     *      "projectName": "projectName",
     *      "projectDesc": "projectDesc",
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
    @PostMapping("/gen/project/new")
    @Transactional(rollbackFor = Exception.class)
    public Result genProjectNew(@RequestBody GenProject entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = genProjectService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/project/update 5. 代码生成-项目-更新信息
     * @apiGroup GEN_PROJECT
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-项目-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [databaseId] <code>body</code>数据库ID
     * @apiParam {String} [moduleName] <code>body</code>模块名
     * @apiParam {String} [projectName] <code>body</code>项目名称
     * @apiParam {String} [projectDesc] <code>body</code>项目说明
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
     *      "databaseId": "databaseId",
     *      "moduleName": "moduleName",
     *      "projectName": "projectName",
     *      "projectDesc": "projectDesc",
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
    @PostMapping("/gen/project/update")
    @Transactional(rollbackFor = Exception.class)
    public Result genProjectUpdate(@RequestBody GenProject entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        genProjectService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/project/save 6. 代码生成-项目-保存信息
     * @apiGroup GEN_PROJECT
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-项目-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [databaseId] <code>body</code>数据库ID
     * @apiParam {String} [moduleName] <code>body</code>模块名
     * @apiParam {String} [projectName] <code>body</code>项目名称
     * @apiParam {String} [projectDesc] <code>body</code>项目说明
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
     *      "databaseId": "databaseId",
     *      "moduleName": "moduleName",
     *      "projectName": "projectName",
     *      "projectDesc": "projectDesc",
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
    @PostMapping("/gen/project/save")
    @Transactional(rollbackFor = Exception.class)
    public Result genProjectSave(@RequestBody GenProject entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = genProjectService.insert(entity);
            entity.setId(id);
        } else {
            GenProject oldEntity = genProjectService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            GenProject.copyIfNotNull(entity, oldEntity);
            genProjectService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/project/remove 7. 代码生成-项目-删除【单个，批量】
     * @apiGroup GEN_PROJECT
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-项目-删除【单个，批量】
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
    @PostMapping("/gen/project/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result genProjectRemove(@RequestBody GenProject entity){
        Integer rt = genProjectService.delete(entity);
        return Result.data(rt);
    }

}

