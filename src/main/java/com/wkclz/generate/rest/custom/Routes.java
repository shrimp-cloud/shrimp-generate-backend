package com.wkclz.generate.rest.custom;


import com.wkclz.common.annotation.Desc;
import com.wkclz.common.annotation.Router;

/**
 * Description:
 * Created: wangkaicun @ 2017-10-19 上午12:46
 */
@Router("cas")
public interface Routes {

    /**
    @Desc("1. console-用户登录日志分页【console-不限制租户，用户】")
    String CONSOLE_LOGIN_LOG_PAGE = "/console/login/log/page";


    @Desc("1. console-用户-角色-分页")
    String CONSOLE_USER_ROLE_PAGE = "/console/user/role/page";
    @Desc("1. console-用户-不存在的角色-分页")
    String CONSOLE_USER_ROLE_NOTEXIST_PAGE = "/console/user/role/notexist/page";
    @Desc("2. console-用户-角色-保存")
    String CONSOLE_USER_ROLE_SAVE = "/console/user/role/save";
    @Desc("3. console-用户-角色-删除")
    String CONSOLE_USER_ROLE_REMOVE = "/console/user/role/remove";

    @Desc("1. console-角色分页")
    String CONSOLE_ROLE_PAGE = "/console/role/page";
    @Desc("2. console-角色新增/修改")
    String CONSOLE_ROLE_SAVE = "/console/role/save";
    @Desc("3. console-角色详情")
    String CONSOLE_ROLE_INFO = "/console/role/info";
    @Desc("4. console-角色删除")
    String CONSOLE_ROLE_REMOVE = "/console/role/remove";
    @Desc("5. console-角色按父节点加载")
    String CONSOLE_ROLE_CHILDREN = "/console/role/children";
    @Desc("6. console-角色加载全部树")
    String CONSOLE_ROLE_TREE = "/console/role/tree";
    @Desc("7. console-角色下拉菜单")
    String CONSOLE_ROLE_OPTION = "/console/role/option";

    @Desc("1. console-角色下的用户-分页")
    String CONSOLE_ROLE_USER_PAGE = "/console/role/user/page";
    @Desc("2. console-角色下的用户-增加")
    String CONSOLE_ROLE_USER_ADD = "/console/role/user/add";
    @Desc("3. console-角色下的用户-移除")
    String CONSOLE_ROLE_USER_REMOVE = "/console/role/user/remove";


    @Desc("1. console-角色资源树，附带角色的资源标识")
    String CONSOLE_ROLE_RESOURCE_TREE = "/console/role/resource/tree";
    @Desc("2. console-角色-资源 保存")
    String CONSOLE_ROLE_RESOURCE_SAVE = "/console/role/resource/save";


    @Desc("1. console-资源-角色-分页")
    String CONSOLE_RESOURCE_ROLE_PAGE = "/console/resource/role/page";
    @Desc("2. console-资源-角色-添加")
    String CONSOLE_RESOURCE_ROLE_ADD = "/console/resource/role/add";
    @Desc("3. console-资源-角色-删除")
    String CONSOLE_RESOURCE_ROLE_REMOVE = "/console/resource/role/remove";

    @Desc("s. console-拥有资源的用户")
    String CONSOLE_RESOURCE_USERS_PAGE = "/console/resource/users/page";


    @Desc("1. console-计划任务触发-用户摘要")
    String CONSOLE_SCHEDULER_USER_SUMMARY = "/console/scheduler/user/summary";

    @Desc("1. console-用户分页")
    String CONSOLE_USER_PAGE = "/console/user/page";
    @Desc("2. console-用户详情")
    String CONSOLE_USER_INFO = "/console/user/info";
    @Desc("3. console-用户保存")
    String CONSOLE_USER_SAVE = "/console/user/save";
    @Desc("4. console-用户改变状态")
    String CONSOLE_USER_STATUS_MODIFY = "/console/user/status/modify";
    @Desc("5. console-用户账号列表")
    String CONSOLE_USER_AUTH_LIST = "/console/user/auth/list";

    @Desc("1. console-用户资源浏览【tree,full】")
    String CONSOLE_USER_RESOURCE_TREE_VIEW = "/console/user/resource/tree/view";
    @Desc("1. console-登录用户资源查询【tree,full】")
    String TERMINAL_USER_RESOURCE_TREE = "/{terminalType}/user/resource/tree";

    @Desc("1. manager-用户登录日志分页【manager-不限制租户，不限制用户】")
    String MANAGER_LOGIN_LOG_PAGE = "/manager/login/log/page";



    @Desc("1. manager-租户管理员列表分页")
    String MANAGER_TENANT_ADMIN_PAGE = "/manager/tenant/admin/page";
    @Desc("2. manager-租户管理员增加")
    String MANAGER_TENANT_ADMIN_ADD = "/manager/tenant/admin/add";
    @Desc("3. manager-租户管理员删除")
    String MANAGER_TENANT_ADMIN_REMOVE = "/manager/tenant/admin/remove";



    @Desc("1. manager-用户表分页查询")
    String MANAGER_USER_PAGE = "/manager/user/page";
    @Desc("2. manager-用户新增/修改")
    String MANAGER_USER_SAVE = "/manager/user/save";
    @Desc("3. manager-用户详情")
    String MANAGER_USER_INFO = "/manager/user/info";
    @Desc("4. manager-用户删除")
    String MANAGER_USER_REMOVE = "/manager/user/remove";

    // MANAGER_USER_AUTH 用户登录凭证管理
    @Desc("1. manager-用户的登录账号列表查询")
    String MANAGER_USER_AUTH_LIST = "/manager/user/auth/list";
    @Desc("2. manager-用户的登录账号详情")
    String MANAGER_USER_AUTH_INFO = "/manager/user/auth/info";
    @Desc("3. manager-用户的登录账号新增")
    String MANAGER_USER_AUTH_ADD = "/manager/user/auth/add";
    @Desc("4. manager-用户的登录账号修改")
    String MANAGER_USER_AUTH_UPDATE = "/manager/user/auth/update";
    @Desc("5. manager-用户的登录账号删除")
    String MANAGER_USER_AUTH_REMOVE = "/manager/user/auth/remove";


    @Desc("1. manager-用户认证信息分页")
    String MANAGER_USER_CERTIFICATE_PAGE = "/manager/user/certificate/page";
    @Desc("2. manager-用户认证信息修改")
    String MANAGER_USER_CERTIFICATE_SAVE = "/manager/user/certificate/save";
    @Desc("3. manager-用户认证信息详情")
    String MANAGER_USER_CERTIFICATE_INFO = "/manager/user/certificate/info";


    @Desc("1. manager-用户角色树，附带已选中的角色标识")
    String MANAGER_USER_ROLE_TREE = "/manager/user/role/tree";
    @Desc("2. manager-用户-角色 保存")
    String MANAGER_USER_ROLE_SAVE = "/manager/user/role/save";


    // USER_TENANT_ADMIN
    @Desc("1. admin-租户管理员分页")
    String ADMIN_TENANT_ADMIN_PAGE = "/admin/tenant/admin/page";
    @Desc("2. admin-租户管理员子账号添加")
    String ADMIN_TENANT_ADMIN_SUBACCOUNT_ADD = "/admin/tenant/admin/subaccount/add";
    @Desc("3. admin-租户管理员子账号删除")
    String ADMIN_TENANT_ADMIN_SUBACCOUNT_REMOVE = "/admin/tenant/admin/subaccount/remove";
    @Desc("4. admin-租户管理员子账号改密码")
    String ADMIN_TENANT_ADMIN_SUBACCOUNT_CHANGEPWD = "/admin/tenant/admin/subaccount/changepwd";


    // ADMIN_USER
    @Desc("1. admin-用户基础信息分页")
    String ADMIN_USER_BASE_INFO_PAGE = "/admin/user/base_info/page";


    // 登录日志
    @Desc("1. admin-用户登录日志分页【admin-限制租户，不限制用户】")
    String ADMIN_LOGIN_LOG_PAGE = "/admin/login/log/page";



    @Desc("6. customer-上传临时素材")
    String CUSTOMER_WX_MEDIA_UPLOAD = "/customer/wx/media/upload";
    @Desc("7. customer-下载临时素材")
    String CUSTOMER_WX_MEDIA_DOWNLOAD = "/customer/wx/media/download/{mediaId}";




    // SSO_USER 登录注册相关接口
    @Desc("1. sso-查询登录用户存在性")
    String SSO_USER_CHECK = "/sso/user/check";
    @Desc("2. sso-登录")
    String SSO_USER_LOGIN = "/sso/user/login";
    @Desc("2.0 sso-刷新")
    String SSO_USER_REFRESH = "/sso/user/refresh";
    @Desc("2.1. sso-手机号登录【账户不存在自动注册】")
    String SSO_MOBILE_LOGIN = "/sso/mobile/login";

    @Desc("2.4 sso-使用临时token登录")
    String PUBLIC_SSO_USER_TOKEN_LOGIN = "/public/sso/user/token/login";
    @Desc("3. sso-登出")
    String SSO_USER_OUT = "/sso/user/logout";
    @Desc("4. sso-登录状态检查")
    String SSO_USER_LOGIN_CHECK = "/sso/user/login/check";
    @Desc("5. sso-注册，保存用户信息")
    String SSO_USER_REGISTER = "/sso/user/register";
    @Desc("6. sso-找回密码")
    String SSO_USER_FIND_PASSWD = "/sso/user/find/passwd";

    */
    /**
     * 登录相关
     */
    @Desc("1.0 login-图片验证码")
    String LOGIN_CAPTCHA_PICTURE = "/public/captcha/picture";


    @Desc("1.1 login-使用临时token登录")
    String LOGIN_USER_TOKEN_TMP = "/public/user/token/login";

    @Desc("1.2 login-登录")
    String LOGIN_USER = "/public/user/login";
}
