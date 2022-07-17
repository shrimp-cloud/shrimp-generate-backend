package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.GenTemplate;
import com.wkclz.generate.service.core.GenTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_template (代码生成-模板) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class GenTemplateRest {

    @Autowired
    private GenTemplateService genTemplateService;

    /**
     * @api {get} /gen/template/page 1. 代码生成-模板-获取分页
     * @apiGroup GEN_TEMPLATE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-模板-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {String} [ftlName] <code>param</code>模板名称
     * @apiParam {String} [fileSubfix] <code>param</code>生成的文件后缀
     * @apiParam {String} [ftlDesc] <code>param</code>模板描述
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
     * @apiSuccess {String} [ftlName] 模板名称
     * @apiSuccess {String} [fileSubfix] 生成的文件后缀
     * @apiSuccess {String} [ftlDesc] 模板描述
     * @apiSuccess {String} [tempContent] 模板内容
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
     *                 "ftlName": "ftlName",
     *                 "fileSubfix": "fileSubfix",
     *                 "ftlDesc": "ftlDesc",
     *                 "tempContent": "tempContent",
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
    @GetMapping("/gen/template/page")
    public Result genTemplatePage(GenTemplate entity){
        PageData<GenTemplate> genTemplates = genTemplateService.page(entity);
        return Result.data(genTemplates);
    }

    /**
     * @api {get} /gen/template/count 2. 代码生成-模板-获取数量
     * @apiGroup GEN_TEMPLATE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-模板-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {String} [ftlName] <code>param</code>模板名称
     * @apiParam {String} [fileSubfix] <code>param</code>生成的文件后缀
     * @apiParam {String} [ftlDesc] <code>param</code>模板描述
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
    @GetMapping("/gen/template/count")
    public Result genTemplateCount(GenTemplate entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(genTemplateService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /gen/template/info 3. 代码生成-模板-获取详情
     * @apiGroup GEN_TEMPLATE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-模板-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {String} [ftlName] 模板名称
     * @apiSuccess {String} [fileSubfix] 生成的文件后缀
     * @apiSuccess {String} [ftlDesc] 模板描述
     * @apiSuccess {String} [tempContent] 模板内容
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
     *          "ftlName": "ftlName",
     *          "fileSubfix": "fileSubfix",
     *          "ftlDesc": "ftlDesc",
     *          "tempContent": "tempContent",
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
    @GetMapping("/gen/template/info")
    public Result genTemplateInfo(GenTemplate entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = genTemplateService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/template/new 4. 代码生成-模板-新增信息
     * @apiGroup GEN_TEMPLATE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-模板-新增信息
     *
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {String} [ftlName] <code>body</code>模板名称
     * @apiParam {String} [fileSubfix] <code>body</code>生成的文件后缀
     * @apiParam {String} [ftlDesc] <code>body</code>模板描述
     * @apiParam {String} [tempContent] <code>body</code>模板内容
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
     *      "ftlName": "ftlName",
     *      "fileSubfix": "fileSubfix",
     *      "ftlDesc": "ftlDesc",
     *      "tempContent": "tempContent",
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
    @PostMapping("/gen/template/new")
    @Transactional(rollbackFor = Exception.class)
    public Result genTemplateNew(@RequestBody GenTemplate entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = genTemplateService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/template/update 5. 代码生成-模板-更新信息
     * @apiGroup GEN_TEMPLATE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-模板-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {String} [ftlName] <code>body</code>模板名称
     * @apiParam {String} [fileSubfix] <code>body</code>生成的文件后缀
     * @apiParam {String} [ftlDesc] <code>body</code>模板描述
     * @apiParam {String} [tempContent] <code>body</code>模板内容
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
     *      "ftlName": "ftlName",
     *      "fileSubfix": "fileSubfix",
     *      "ftlDesc": "ftlDesc",
     *      "tempContent": "tempContent",
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
    @PostMapping("/gen/template/update")
    @Transactional(rollbackFor = Exception.class)
    public Result genTemplateUpdate(@RequestBody GenTemplate entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        genTemplateService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/template/save 6. 代码生成-模板-保存信息
     * @apiGroup GEN_TEMPLATE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-模板-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {String} [ftlName] <code>body</code>模板名称
     * @apiParam {String} [fileSubfix] <code>body</code>生成的文件后缀
     * @apiParam {String} [ftlDesc] <code>body</code>模板描述
     * @apiParam {String} [tempContent] <code>body</code>模板内容
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
     *      "ftlName": "ftlName",
     *      "fileSubfix": "fileSubfix",
     *      "ftlDesc": "ftlDesc",
     *      "tempContent": "tempContent",
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
    @PostMapping("/gen/template/save")
    @Transactional(rollbackFor = Exception.class)
    public Result genTemplateSave(@RequestBody GenTemplate entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = genTemplateService.insert(entity);
            entity.setId(id);
        } else {
            GenTemplate oldEntity = genTemplateService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            GenTemplate.copyIfNotNull(entity, oldEntity);
            genTemplateService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/template/remove 7. 代码生成-模板-删除【单个，批量】
     * @apiGroup GEN_TEMPLATE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-模板-删除【单个，批量】
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
    @PostMapping("/gen/template/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result genTemplateRemove(@RequestBody GenTemplate entity){
        Integer rt = genTemplateService.delete(entity);
        return Result.data(rt);
    }

}

