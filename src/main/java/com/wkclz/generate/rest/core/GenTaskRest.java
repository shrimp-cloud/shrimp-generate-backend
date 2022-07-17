package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.GenTask;
import com.wkclz.generate.service.core.GenTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_task (代码生成-任务) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class GenTaskRest {

    @Autowired
    private GenTaskService genTaskService;

    /**
     * @api {get} /gen/task/page 1. 代码生成-任务-获取分页
     * @apiGroup GEN_TASK
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-任务-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [projectId] <code>param</code>项目ID
     * @apiParam {Long} [tempId] <code>param</code>模板ID
     * @apiParam {String} [taskName] <code>param</code>任务名称
     * @apiParam {Integer} [needCreate] <code>param</code>是否生成
     * @apiParam {Integer} [needDelete] <code>param</code>是否删除(本地模式有效)
     * @apiParam {String} [projectBasePath] <code>param</code>任务项目基本路径
     * @apiParam {String} [packagePath] <code>param</code>任务包路径
     * @apiParam {String} [taskDesc] <code>param</code>任务描述
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
     * @apiSuccess {Long} [tempId] 模板ID
     * @apiSuccess {String} [taskName] 任务名称
     * @apiSuccess {Integer} [needCreate] 是否生成
     * @apiSuccess {Integer} [needDelete] 是否删除(本地模式有效)
     * @apiSuccess {String} [projectBasePath] 任务项目基本路径
     * @apiSuccess {String} [packagePath] 任务包路径
     * @apiSuccess {String} [taskDesc] 任务描述
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
     *                 "tempId": "tempId",
     *                 "taskName": "taskName",
     *                 "needCreate": "needCreate",
     *                 "needDelete": "needDelete",
     *                 "projectBasePath": "projectBasePath",
     *                 "packagePath": "packagePath",
     *                 "taskDesc": "taskDesc",
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
    @GetMapping("/gen/task/page")
    public Result genTaskPage(GenTask entity){
        PageData<GenTask> genTasks = genTaskService.page(entity);
        return Result.data(genTasks);
    }

    /**
     * @api {get} /gen/task/count 2. 代码生成-任务-获取数量
     * @apiGroup GEN_TASK
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-任务-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [projectId] <code>param</code>项目ID
     * @apiParam {Long} [tempId] <code>param</code>模板ID
     * @apiParam {String} [taskName] <code>param</code>任务名称
     * @apiParam {Integer} [needCreate] <code>param</code>是否生成
     * @apiParam {Integer} [needDelete] <code>param</code>是否删除(本地模式有效)
     * @apiParam {String} [projectBasePath] <code>param</code>任务项目基本路径
     * @apiParam {String} [packagePath] <code>param</code>任务包路径
     * @apiParam {String} [taskDesc] <code>param</code>任务描述
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
    @GetMapping("/gen/task/count")
    public Result genTaskCount(GenTask entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(genTaskService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /gen/task/info 3. 代码生成-任务-获取详情
     * @apiGroup GEN_TASK
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-任务-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {Long} [projectId] 项目ID
     * @apiSuccess {Long} [tempId] 模板ID
     * @apiSuccess {String} [taskName] 任务名称
     * @apiSuccess {Integer} [needCreate] 是否生成
     * @apiSuccess {Integer} [needDelete] 是否删除(本地模式有效)
     * @apiSuccess {String} [projectBasePath] 任务项目基本路径
     * @apiSuccess {String} [packagePath] 任务包路径
     * @apiSuccess {String} [taskDesc] 任务描述
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
     *          "tempId": "tempId",
     *          "taskName": "taskName",
     *          "needCreate": "needCreate",
     *          "needDelete": "needDelete",
     *          "projectBasePath": "projectBasePath",
     *          "packagePath": "packagePath",
     *          "taskDesc": "taskDesc",
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
    @GetMapping("/gen/task/info")
    public Result genTaskInfo(GenTask entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = genTaskService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/task/new 4. 代码生成-任务-新增信息
     * @apiGroup GEN_TASK
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-任务-新增信息
     *
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
     * @apiParam {Long} [tempId] <code>body</code>模板ID
     * @apiParam {String} [taskName] <code>body</code>任务名称
     * @apiParam {Integer} [needCreate] <code>body</code>是否生成
     * @apiParam {Integer} [needDelete] <code>body</code>是否删除(本地模式有效)
     * @apiParam {String} [projectBasePath] <code>body</code>任务项目基本路径
     * @apiParam {String} [packagePath] <code>body</code>任务包路径
     * @apiParam {String} [taskDesc] <code>body</code>任务描述
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
     *      "tempId": "tempId",
     *      "taskName": "taskName",
     *      "needCreate": "needCreate",
     *      "needDelete": "needDelete",
     *      "projectBasePath": "projectBasePath",
     *      "packagePath": "packagePath",
     *      "taskDesc": "taskDesc",
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
    @PostMapping("/gen/task/new")
    @Transactional(rollbackFor = Exception.class)
    public Result genTaskNew(@RequestBody GenTask entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = genTaskService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/task/update 5. 代码生成-任务-更新信息
     * @apiGroup GEN_TASK
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-任务-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
     * @apiParam {Long} [tempId] <code>body</code>模板ID
     * @apiParam {String} [taskName] <code>body</code>任务名称
     * @apiParam {Integer} [needCreate] <code>body</code>是否生成
     * @apiParam {Integer} [needDelete] <code>body</code>是否删除(本地模式有效)
     * @apiParam {String} [projectBasePath] <code>body</code>任务项目基本路径
     * @apiParam {String} [packagePath] <code>body</code>任务包路径
     * @apiParam {String} [taskDesc] <code>body</code>任务描述
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
     *      "tempId": "tempId",
     *      "taskName": "taskName",
     *      "needCreate": "needCreate",
     *      "needDelete": "needDelete",
     *      "projectBasePath": "projectBasePath",
     *      "packagePath": "packagePath",
     *      "taskDesc": "taskDesc",
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
    @PostMapping("/gen/task/update")
    @Transactional(rollbackFor = Exception.class)
    public Result genTaskUpdate(@RequestBody GenTask entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        genTaskService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/task/save 6. 代码生成-任务-保存信息
     * @apiGroup GEN_TASK
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-任务-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
     * @apiParam {Long} [tempId] <code>body</code>模板ID
     * @apiParam {String} [taskName] <code>body</code>任务名称
     * @apiParam {Integer} [needCreate] <code>body</code>是否生成
     * @apiParam {Integer} [needDelete] <code>body</code>是否删除(本地模式有效)
     * @apiParam {String} [projectBasePath] <code>body</code>任务项目基本路径
     * @apiParam {String} [packagePath] <code>body</code>任务包路径
     * @apiParam {String} [taskDesc] <code>body</code>任务描述
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
     *      "tempId": "tempId",
     *      "taskName": "taskName",
     *      "needCreate": "needCreate",
     *      "needDelete": "needDelete",
     *      "projectBasePath": "projectBasePath",
     *      "packagePath": "packagePath",
     *      "taskDesc": "taskDesc",
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
    @PostMapping("/gen/task/save")
    @Transactional(rollbackFor = Exception.class)
    public Result genTaskSave(@RequestBody GenTask entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = genTaskService.insert(entity);
            entity.setId(id);
        } else {
            GenTask oldEntity = genTaskService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            GenTask.copyIfNotNull(entity, oldEntity);
            genTaskService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/task/remove 7. 代码生成-任务-删除【单个，批量】
     * @apiGroup GEN_TASK
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-任务-删除【单个，批量】
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
    @PostMapping("/gen/task/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result genTaskRemove(@RequestBody GenTask entity){
        Integer rt = genTaskService.delete(entity);
        return Result.data(rt);
    }

}

