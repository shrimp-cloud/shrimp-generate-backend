package com.wkclz.generate.rest.core;

import com.wkclz.common.entity.BaseEntity;
import com.wkclz.common.entity.Result;
import com.wkclz.common.utils.AssertUtil;
import com.wkclz.mybatis.base.PageData;
import com.wkclz.generate.pojo.entity.CasLoginLog;
import com.wkclz.generate.service.core.CasLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Description Create by lz-gen
 * @author wangkaicun
 * @table cas_login_log (登录日志) 示例rest 接口，代码重新生成会覆盖
 */
// @RestController
public class CasLoginLogRest {

    @Autowired
    private CasLoginLogService casLoginLogService;

    /**
     * @api {get} /cas/login/log/page 1. 登录日志-获取分页
     * @apiGroup CAS_LOGIN_LOG
     *
     * @apiVersion 0.0.1
     * @apiDescription 登录日志-获取分页
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>登录的用户ID【密码错时为0】
     * @apiParam {String} [loginName] <code>param</code>登录名
     * @apiParam {String} [loginIp] <code>param</code>登录IP
     * @apiParam {Date} [loginTime] <code>param</code>登录时间
     * @apiParam {Integer} [loginStatus] <code>param</code>登录状态【1:成功，0：失败】
     * @apiParam {String} [reason] <code>param</code>登录失败原因
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
     * @apiSuccess {Long} [userId] 登录的用户ID【密码错时为0】
     * @apiSuccess {String} [loginName] 登录名
     * @apiSuccess {String} [loginIp] 登录IP
     * @apiSuccess {Date} [loginTime] 登录时间
     * @apiSuccess {Integer} [loginStatus] 登录状态【1:成功，0：失败】
     * @apiSuccess {String} [reason] 登录失败原因
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
     *                 "loginName": "loginName",
     *                 "loginIp": "loginIp",
     *                 "loginTime": "loginTime",
     *                 "loginStatus": "loginStatus",
     *                 "reason": "reason",
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
    @GetMapping("/cas/login/log/page")
    public Result casLoginLogPage(CasLoginLog entity){
        PageData<CasLoginLog> casLoginLogs = casLoginLogService.page(entity);
        return Result.data(casLoginLogs);
    }

    /**
     * @api {get} /cas/login/log/count 2. 登录日志-获取数量
     * @apiGroup CAS_LOGIN_LOG
     *
     * @apiVersion 0.0.1
     * @apiDescription 登录日志-获取数量
     *
     * @apiParam {Long} [id] <code>param</code>ID
     * @apiParam {Long} [userId] <code>param</code>登录的用户ID【密码错时为0】
     * @apiParam {String} [loginName] <code>param</code>登录名
     * @apiParam {String} [loginIp] <code>param</code>登录IP
     * @apiParam {Date} [loginTime] <code>param</code>登录时间
     * @apiParam {Integer} [loginStatus] <code>param</code>登录状态【1:成功，0：失败】
     * @apiParam {String} [reason] <code>param</code>登录失败原因
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
    @GetMapping("/cas/login/log/count")
    public Result casLoginLogCount(CasLoginLog entity){
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCount(casLoginLogService.count(entity));
        return Result.data(baseEntity);
    }

    /**
     * @api {get} /cas/login/log/info 3. 登录日志-获取详情
     * @apiGroup CAS_LOGIN_LOG
     *
     * @apiVersion 0.0.1
     * @apiDescription 登录日志-获取详情
     *
     * @apiParam {Long} id <code>param</code>数据Id
     *
     * @apiParamExample {param} 请求样例:
     * ?id=1
     *
     * @apiSuccess {Long} [id] ID
     * @apiSuccess {Long} [userId] 登录的用户ID【密码错时为0】
     * @apiSuccess {String} [loginName] 登录名
     * @apiSuccess {String} [loginIp] 登录IP
     * @apiSuccess {Date} [loginTime] 登录时间
     * @apiSuccess {Integer} [loginStatus] 登录状态【1:成功，0：失败】
     * @apiSuccess {String} [reason] 登录失败原因
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
     *          "loginName": "loginName",
     *          "loginIp": "loginIp",
     *          "loginTime": "loginTime",
     *          "loginStatus": "loginStatus",
     *          "reason": "reason",
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
    @GetMapping("/cas/login/log/info")
    public Result casLoginLogInfo(CasLoginLog entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        entity = casLoginLogService.get(entity.getId());
        if (entity == null){
            return Result.error("id is error");
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/login/log/new 4. 登录日志-新增信息
     * @apiGroup CAS_LOGIN_LOG
     *
     * @apiVersion 0.0.1
     * @apiDescription 登录日志-新增信息
     *
     * @apiParam {Long} [userId] <code>body</code>登录的用户ID【密码错时为0】
     * @apiParam {String} [loginName] <code>body</code>登录名
     * @apiParam {String} [loginIp] <code>body</code>登录IP
     * @apiParam {Date} [loginTime] <code>body</code>登录时间
     * @apiParam {Integer} [loginStatus] <code>body</code>登录状态【1:成功，0：失败】
     * @apiParam {String} [reason] <code>body</code>登录失败原因
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
     *      "loginName": "loginName",
     *      "loginIp": "loginIp",
     *      "loginTime": "loginTime",
     *      "loginStatus": "loginStatus",
     *      "reason": "reason",
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
    @PostMapping("/cas/login/log/new")
    @Transactional(rollbackFor = Exception.class)
    public Result casLoginLogNew(@RequestBody CasLoginLog entity){
        // 按需添加限制条件
        entity.setId(null);
        Long id = casLoginLogService.insert(entity);
        entity.setId(id);
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/login/log/update 5. 登录日志-更新信息
     * @apiGroup CAS_LOGIN_LOG
     *
     * @apiVersion 0.0.1
     * @apiDescription 登录日志-更新信息
     *
     * @apiParam {Long} id <code>body</code>ID
     * @apiParam {Long} [userId] <code>body</code>登录的用户ID【密码错时为0】
     * @apiParam {String} [loginName] <code>body</code>登录名
     * @apiParam {String} [loginIp] <code>body</code>登录IP
     * @apiParam {Date} [loginTime] <code>body</code>登录时间
     * @apiParam {Integer} [loginStatus] <code>body</code>登录状态【1:成功，0：失败】
     * @apiParam {String} [reason] <code>body</code>登录失败原因
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
     *      "loginName": "loginName",
     *      "loginIp": "loginIp",
     *      "loginTime": "loginTime",
     *      "loginStatus": "loginStatus",
     *      "reason": "reason",
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
    @PostMapping("/cas/login/log/update")
    @Transactional(rollbackFor = Exception.class)
    public Result casLoginLogUpdate(@RequestBody CasLoginLog entity){
        AssertUtil.notNull(entity.getId(), "id can not be null");
        casLoginLogService.updateSelective(entity);
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/login/log/save 6. 登录日志-保存信息
     * @apiGroup CAS_LOGIN_LOG
     *
     * @apiVersion 0.0.1
     * @apiDescription 登录日志-保存信息
     *
     * @apiParam {Long} id <code>body</code>ID【存在即更新，不存在即创建】
     * @apiParam {Long} [userId] <code>body</code>登录的用户ID【密码错时为0】
     * @apiParam {String} [loginName] <code>body</code>登录名
     * @apiParam {String} [loginIp] <code>body</code>登录IP
     * @apiParam {Date} [loginTime] <code>body</code>登录时间
     * @apiParam {Integer} [loginStatus] <code>body</code>登录状态【1:成功，0：失败】
     * @apiParam {String} [reason] <code>body</code>登录失败原因
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
     *      "loginName": "loginName",
     *      "loginIp": "loginIp",
     *      "loginTime": "loginTime",
     *      "loginStatus": "loginStatus",
     *      "reason": "reason",
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
    @PostMapping("/cas/login/log/save")
    @Transactional(rollbackFor = Exception.class)
    public Result casLoginLogSave(@RequestBody CasLoginLog entity){
        // 条件判断
        AssertUtil.notNull(entity.getVersion(),"请求错误！参数[version]不能为空");

        if (entity.getId() == null){
            Long id = casLoginLogService.insert(entity);
            entity.setId(id);
        } else {
            CasLoginLog oldEntity = casLoginLogService.get(entity.getId());
            if (oldEntity == null) {
                return Result.error("id 错误，数据不存在");
            }
            CasLoginLog.copyIfNotNull(entity, oldEntity);
            casLoginLogService.updateSelective(oldEntity);
        }
        return Result.data(entity);
    }

    /**
     * @api {post} /cas/login/log/remove 7. 登录日志-删除【单个，批量】
     * @apiGroup CAS_LOGIN_LOG
     *
     * @apiVersion 0.0.1
     * @apiDescription 登录日志-删除【单个，批量】
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
    @PostMapping("/cas/login/log/remove")
    @Transactional(rollbackFor = Exception.class)
    public Result casLoginLogRemove(@RequestBody CasLoginLog entity){
        Integer rt = casLoginLogService.delete(entity);
        return Result.data(rt);
    }

}

