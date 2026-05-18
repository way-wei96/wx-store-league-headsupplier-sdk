package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.http.ApiExecutor;

/**
 * 佣金单接口（按官方文档逐步补充方法）。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/order/">官方文档</a>
 */
public final class OrderApi {

    private final ApiExecutor executor;

    public OrderApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public ApiExecutor getExecutor() {
        return executor;
    }
}
