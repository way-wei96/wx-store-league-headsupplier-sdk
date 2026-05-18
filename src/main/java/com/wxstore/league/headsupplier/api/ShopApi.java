package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.http.ApiExecutor;

/**
 * 商品相关接口（按官方文档逐步补充方法）。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/shop/">官方文档</a>
 */
public final class ShopApi {

    private final ApiExecutor executor;

    public ShopApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public ApiExecutor getExecutor() {
        return executor;
    }
}
