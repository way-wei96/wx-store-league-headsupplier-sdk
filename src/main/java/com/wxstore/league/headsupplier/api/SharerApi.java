package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.http.ApiExecutor;

/**
 * 推客带货接口（按官方文档逐步补充方法）。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/sharer/">官方文档</a>
 */
public final class SharerApi {

    private final ApiExecutor executor;

    public SharerApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public ApiExecutor getExecutor() {
        return executor;
    }
}
