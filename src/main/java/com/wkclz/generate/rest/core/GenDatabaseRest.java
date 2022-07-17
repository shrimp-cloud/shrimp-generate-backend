package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.GenDatabase;
import com.wkclz.generate.service.core.GenDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table gen_database (代码生成-数据库) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class GenDatabaseRest {

    @Autowired
    private GenDatabaseService genDatabaseService;

    /**
     * @api {get} /gen/database/page 1. 代码生成-数据库-获取分页
     * @apiGroup GEN_DATABASE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-数据库-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {String} [databaseHost] <code>param</code>主机名
     * @apiParam {String} [databaseType] <code>param</code>数据库类型
     * @apiParam {Integer} [databasePort] <code>param</code>端口
     * @apiParam {String} [databaseName] <code>param</code>数据库名称
     * @apiParam {String} [username] <code>param</code>数据库用户名
     * @apiParam {String} [password] <code>param</code>数据库密码
     * @apiParam {String} [prefix] <code>param</code>表前缀
     * @apiParam {Integer} [retainPrifx] <code>param</code>保留表前缀
     * @apiParam {String} [ignoreTables] <code>param</code>忽略的表,英文逗号分隔
     * @apiParam {String} [ignoreCloumns] <code>param</code>忽略的字段,英文逗号分隔
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
     * @apiSuccess {String} [databaseHost] 主机名
     * @apiSuccess {String} [databaseType] 数据库类型
     * @apiSuccess {Integer} [databasePort] 端口
     * @apiSuccess {String} [databaseName] 数据库名称
     * @apiSuccess {String} [username] 数据库用户名
     * @apiSuccess {String} [password] 数据库密码
     * @apiSuccess {String} [prefix] 表前缀
     * @apiSuccess {Integer} [retainPrifx] 保留表前缀
     * @apiSuccess {String} [ignoreTables] 忽略的表,英文逗号分隔
     * @apiSuccess {String} [ignoreCloumns] 忽略的字段,英文逗号分隔
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
     *                 "databaseHost": "databaseHost",
     *                 "databaseType": "databaseType",
     *                 "databasePort": "databasePort",
     *                 "databaseName": "databaseName",
     *                 "username": "username",
     *                 "password": "password",
     *                 "prefix": "prefix",
     *                 "retainPrifx": "retainPrifx",
     *                 "ignoreTables": "ignoreTables",
     *                 "ignoreCloumns": "ignoreCloumns",
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
    @GetMapping("/gen/database/page")
    public Result genDatabasePage(GenDatabase entity){
        PageData<GenDatabase> genDatabases = genDatabaseService.page(entity);
        return Result.data(genDatabases);
    }

    /**
     * @api {get} /gen/database/count 2. 代码生成-数据库-获取数量
     * @apiGroup GEN_DATABASE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-数据库-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>用户ID
     * @apiParam {String} [databaseHost] <code>param</code>主机名
     * @apiParam {String} [databaseType] <code>param</code>数据库类型
     * @apiParam {Integer} [databasePort] <code>param</code>端口
     * @apiParam {String} [databaseName] <code>param</code>数据库名称
     * @apiParam {String} [username] <code>param</code>数据库用户名
     * @apiParam {String} [password] <code>param</code>数据库密码
     * @apiParam {String} [prefix] <code>param</code>表前缀
     * @apiParam {Integer} [retainPrifx] <code>param</code>保留表前缀
     * @apiParam {String} [ignoreTables] <code>param</code>忽略的表,英文逗号分隔
     * @apiParam {String} [ignoreCloumns] <code>param</code>忽略的字段,英文逗号分隔
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
    @GetMapping("/gen/database/count")
    public Result genDatabaseCount(GenDatabase entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(genDatabaseService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /gen/database/info 3. 代码生成-数据库-获取详情
     * @apiGroup GEN_DATABASE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-数据库-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Long} [userId] 用户ID
     * @apiSuccess {String} [databaseHost] 主机名
     * @apiSuccess {String} [databaseType] 数据库类型
     * @apiSuccess {Integer} [databasePort] 端口
     * @apiSuccess {String} [databaseName] 数据库名称
     * @apiSuccess {String} [username] 数据库用户名
     * @apiSuccess {String} [password] 数据库密码
     * @apiSuccess {String} [prefix] 表前缀
     * @apiSuccess {Integer} [retainPrifx] 保留表前缀
     * @apiSuccess {String} [ignoreTables] 忽略的表,英文逗号分隔
     * @apiSuccess {String} [ignoreCloumns] 忽略的字段,英文逗号分隔
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
     *          "databaseHost": "databaseHost",
     *          "databaseType": "databaseType",
     *          "databasePort": "databasePort",
     *          "databaseName": "databaseName",
     *          "username": "username",
     *          "password": "password",
     *          "prefix": "prefix",
     *          "retainPrifx": "retainPrifx",
     *          "ignoreTables": "ignoreTables",
     *          "ignoreCloumns": "ignoreCloumns",
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
    @GetMapping("/gen/database/info")
    public Result genDatabaseInfo(GenDatabase entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = genDatabaseService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/database/new 4. 代码生成-数据库-新增信息
     * @apiGroup GEN_DATABASE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-数据库-新增信息
     *
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {String} [databaseHost] <code>body</code>主机名
     * @apiParam {String} [databaseType] <code>body</code>数据库类型
     * @apiParam {Integer} [databasePort] <code>body</code>端口
     * @apiParam {String} [databaseName] <code>body</code>数据库名称
     * @apiParam {String} [username] <code>body</code>数据库用户名
     * @apiParam {String} [password] <code>body</code>数据库密码
     * @apiParam {String} [prefix] <code>body</code>表前缀
     * @apiParam {Integer} [retainPrifx] <code>body</code>保留表前缀
     * @apiParam {String} [ignoreTables] <code>body</code>忽略的表,英文逗号分隔
     * @apiParam {String} [ignoreCloumns] <code>body</code>忽略的字段,英文逗号分隔
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
     *      "databaseHost": "databaseHost",
     *      "databaseType": "databaseType",
     *      "databasePort": "databasePort",
     *      "databaseName": "databaseName",
     *      "username": "username",
     *      "password": "password",
     *      "prefix": "prefix",
     *      "retainPrifx": "retainPrifx",
     *      "ignoreTables": "ignoreTables",
     *      "ignoreCloumns": "ignoreCloumns",
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
    @PostMapping("/gen/database/new")
    @Transactional(rollbackFor = Exception.class)
    public Result genDatabaseNew(@RequestBody GenDatabase entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = genDatabaseService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/database/update 5. 代码生成-数据库-更新信息
     * @apiGroup GEN_DATABASE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-数据库-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {String} [databaseHost] <code>body</code>主机名
     * @apiParam {String} [databaseType] <code>body</code>数据库类型
     * @apiParam {Integer} [databasePort] <code>body</code>端口
     * @apiParam {String} [databaseName] <code>body</code>数据库名称
     * @apiParam {String} [username] <code>body</code>数据库用户名
     * @apiParam {String} [password] <code>body</code>数据库密码
     * @apiParam {String} [prefix] <code>body</code>表前缀
     * @apiParam {Integer} [retainPrifx] <code>body</code>保留表前缀
     * @apiParam {String} [ignoreTables] <code>body</code>忽略的表,英文逗号分隔
     * @apiParam {String} [ignoreCloumns] <code>body</code>忽略的字段,英文逗号分隔
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
     *      "databaseHost": "databaseHost",
     *      "databaseType": "databaseType",
     *      "databasePort": "databasePort",
     *      "databaseName": "databaseName",
     *      "username": "username",
     *      "password": "password",
     *      "prefix": "prefix",
     *      "retainPrifx": "retainPrifx",
     *      "ignoreTables": "ignoreTables",
     *      "ignoreCloumns": "ignoreCloumns",
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
    @PostMapping("/gen/database/update")
    @Transactional(rollbackFor = Exception.class)
    public Result genDatabaseUpdate(@RequestBody GenDatabase entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        genDatabaseService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/database/save 6. 代码生成-数据库-保存信息
     * @apiGroup GEN_DATABASE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-数据库-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {Long} [userId] <code>body</code>用户ID
     * @apiParam {String} [databaseHost] <code>body</code>主机名
     * @apiParam {String} [databaseType] <code>body</code>数据库类型
     * @apiParam {Integer} [databasePort] <code>body</code>端口
     * @apiParam {String} [databaseName] <code>body</code>数据库名称
     * @apiParam {String} [username] <code>body</code>数据库用户名
     * @apiParam {String} [password] <code>body</code>数据库密码
     * @apiParam {String} [prefix] <code>body</code>表前缀
     * @apiParam {Integer} [retainPrifx] <code>body</code>保留表前缀
     * @apiParam {String} [ignoreTables] <code>body</code>忽略的表,英文逗号分隔
     * @apiParam {String} [ignoreCloumns] <code>body</code>忽略的字段,英文逗号分隔
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
     *      "databaseHost": "databaseHost",
     *      "databaseType": "databaseType",
     *      "databasePort": "databasePort",
     *      "databaseName": "databaseName",
     *      "username": "username",
     *      "password": "password",
     *      "prefix": "prefix",
     *      "retainPrifx": "retainPrifx",
     *      "ignoreTables": "ignoreTables",
     *      "ignoreCloumns": "ignoreCloumns",
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
    @PostMapping("/gen/database/save")
    @Transactional(rollbackFor = Exception.class)
    public Result genDatabaseSave(@RequestBody GenDatabase entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = genDatabaseService.insert(entity);
            entity.setId(id);
        } else {
            GenDatabase oldEntity = genDatabaseService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            GenDatabase.copyIfNotNull(entity, oldEntity);
            genDatabaseService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /gen/database/remove 7. 代码生成-数据库-删除【单个，批量】
     * @apiGroup GEN_DATABASE
     *
     * @apiVersion 0.0.1
     * @apiDescription 代码生成-数据库-删除【单个，批量】
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
    @PostMapping("/gen/database/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result genDatabaseRemove(@RequestBody GenDatabase entity){
        Integer rt = genDatabaseService.delete(entity);
        return Result.data(rt);
    }

}

