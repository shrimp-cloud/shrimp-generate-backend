package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.GenVariables;
import com.wkclz.generate.service.core.GenVariablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_variables (代码生成-变量) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class GenVariablesRest {

    @Autowired
    private GenVariablesService genVariablesService;

    /**
     * @api {get} /gen/variables/page 1. 代码生成-变量-获取分页
     * @apiGroup GEN_VARIABLES
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-变量-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {String} [varType] <code>param</code>变量类型:全局变量:GLOBAL,用户变量:USER,项目变量:PROJECT
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [projectId] <code>param</code>项目ID
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
     * @apiSuccess {String} [varType] 变量类型:全局变量:GLOBAL,用户变量:USER,项目变量:PROJECT
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {Long} [projectId] 项目ID
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
     *                 "varType": "varType",
     *                 "userId": "userId",
     *                 "projectId": "projectId",
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
    @GetMapping("/gen/variables/page")
    public Result genVariablesPage(GenVariables entity){
        PageData<GenVariables> genVariabless = genVariablesService.page(entity);
        return Result.data(genVariabless);
    }

    /**
     * @api {get} /gen/variables/count 2. 代码生成-变量-获取数量
     * @apiGroup GEN_VARIABLES
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-变量-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {String} [varType] <code>param</code>变量类型:全局变量:GLOBAL,用户变量:USER,项目变量:PROJECT
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {Long} [projectId] <code>param</code>项目ID
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
    @GetMapping("/gen/variables/count")
    public Result genVariablesCount(GenVariables entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(genVariablesService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /gen/variables/info 3. 代码生成-变量-获取详情
     * @apiGroup GEN_VARIABLES
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-变量-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {String} [varType] 变量类型:全局变量:GLOBAL,用户变量:USER,项目变量:PROJECT
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {Long} [projectId] 项目ID
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
     *          "varType": "varType",
     *          "userId": "userId",
     *          "projectId": "projectId",
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
    @GetMapping("/gen/variables/info")
    public Result genVariablesInfo(GenVariables entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = genVariablesService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/variables/new 4. 代码生成-变量-新增信息
     * @apiGroup GEN_VARIABLES
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-变量-新增信息
     *
     * @apiParam {String} [varType] <code>body</code>变量类型:全局变量:GLOBAL,用户变量:USER,项目变量:PROJECT
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
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
     *      "varType": "varType",
     *      "userId": "userId",
     *      "projectId": "projectId",
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
    @PostMapping("/gen/variables/new")
    @Transactional(rollbackFor = Exception.class)
    public Result genVariablesNew(@RequestBody GenVariables entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = genVariablesService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/variables/update 5. 代码生成-变量-更新信息
     * @apiGroup GEN_VARIABLES
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-变量-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {String} [varType] <code>body</code>变量类型:全局变量:GLOBAL,用户变量:USER,项目变量:PROJECT
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
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
     *      "varType": "varType",
     *      "userId": "userId",
     *      "projectId": "projectId",
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
    @PostMapping("/gen/variables/update")
    @Transactional(rollbackFor = Exception.class)
    public Result genVariablesUpdate(@RequestBody GenVariables entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        genVariablesService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/variables/save 6. 代码生成-变量-保存信息
     * @apiGroup GEN_VARIABLES
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-变量-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {String} [varType] <code>body</code>变量类型:全局变量:GLOBAL,用户变量:USER,项目变量:PROJECT
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {Long} [projectId] <code>body</code>项目ID
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
     *      "varType": "varType",
     *      "userId": "userId",
     *      "projectId": "projectId",
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
    @PostMapping("/gen/variables/save")
    @Transactional(rollbackFor = Exception.class)
    public Result genVariablesSave(@RequestBody GenVariables entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = genVariablesService.insert(entity);
            entity.setId(id);
        } else {
            GenVariables oldEntity = genVariablesService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            GenVariables.copyIfNotNull(entity, oldEntity);
            genVariablesService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/variables/remove 7. 代码生成-变量-删除【单个，批量】
     * @apiGroup GEN_VARIABLES
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-变量-删除【单个，批量】
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
    @PostMapping("/gen/variables/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result genVariablesRemove(@RequestBody GenVariables entity){
        Integer rt = genVariablesService.delete(entity);
        return Result.data(rt);
    }

}

