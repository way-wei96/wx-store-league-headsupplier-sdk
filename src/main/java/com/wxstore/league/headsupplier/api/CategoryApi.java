package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.WxApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.category.GetAllCategoryResponse;

import java.util.Collections;

/**
 * 类目接口。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/category/">官方文档</a>
 */
public final class CategoryApi {

    private final ApiExecutor executor;

    public CategoryApi(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * 获取全部类目及资质信息（含旧版 cats 与新版 cats_v2，数据量大、耗时较高）。
     */
    public GetAllCategoryResponse getAllCategory() {
        return executor.get(WxApiPaths.GET_ALL_CATEGORY, Collections.emptyMap(), GetAllCategoryResponse.class);
    }
}
