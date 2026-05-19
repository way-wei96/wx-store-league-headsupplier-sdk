package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.api.sharer.SharerAccountApi;
import com.wxstore.league.headsupplier.api.sharer.SharerProductApi;
import com.wxstore.league.headsupplier.http.ApiExecutor;

/**
 * 推客带货接口入口（按子模块拆分）。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/sharer/">官方文档</a>
 */
public final class SharerApi {

    private final SharerAccountApi account;
    private final SharerProductApi product;

    public SharerApi(ApiExecutor executor) {
        this.account = new SharerAccountApi(executor);
        this.product = new SharerProductApi(executor);
    }

    public SharerAccountApi account() {
        return account;
    }

    public SharerProductApi product() {
        return product;
    }

    public ApiExecutor getExecutor() {
        throw new UnsupportedOperationException("请使用各子模块 API，例如 sharer().account()");
    }
}
