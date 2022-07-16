package com.wkclz.generate.rest.custom;


import com.wkclz.common.annotation.Desc;
import com.wkclz.common.annotation.Router;

/**
 * Description:
 * Created: wangkaicun @ 2017-10-19 上午12:46
 */
@Router("demo")
public interface Routes {

    /**
     * 一个接口组对应一个 Controller
     */


    @Desc("1、demo-全类型-获取分页")
    String DEMO_TYPES_PAGE = "/demo/types/page";
    @Desc("2、demo-全类型-获取数量")
    String DEMO_TYPES_COUNT = "/demo/types/count";
    @Desc("3、demo-全类型-获取详情")
    String DEMO_TYPES_DETAIL = "/demo/types/detail";
    @Desc("4、demo-全类型-新增信息")
    String DEMO_TYPES_NEW = "/demo/types/new";
    @Desc("5、demo-全类型-更新信息")
    String DEMO_TYPES_UPDATE = "/demo/types/update";
    @Desc("6、demo-全类型-保存信息")
    String DEMO_TYPES_SAVE = "/demo/types/save";
    @Desc("7、demo-全类型-删除【单个，批量】")
    String DEMO_TYPES_REMOVE = "/demo/types/remove";



}
