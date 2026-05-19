package com.wxstore.league.headsupplier.api.opentalent;

import com.wxstore.league.headsupplier.http.ApiExecutor;

/**
 * 达人带货接口入口。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/opentalent/">官方文档</a>
 */
public final class OpenTalentApi {

    private final OpenTalentWindowApi window;
    private final OpenTalentShopApi shop;

    public OpenTalentApi(ApiExecutor executor) {
        this.window = new OpenTalentWindowApi(executor);
        this.shop = new OpenTalentShopApi(executor);
    }

    public OpenTalentWindowApi window() {
        return window;
    }

    public OpenTalentShopApi shop() {
        return shop;
    }
}
