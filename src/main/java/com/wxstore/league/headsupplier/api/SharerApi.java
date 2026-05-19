package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.api.sharer.SharerAccountApi;
import com.wxstore.league.headsupplier.api.sharer.SharerArticleApi;
import com.wxstore.league.headsupplier.api.sharer.SharerClueApi;
import com.wxstore.league.headsupplier.api.sharer.SharerCouponApi;
import com.wxstore.league.headsupplier.api.sharer.SharerLiveApi;
import com.wxstore.league.headsupplier.api.sharer.SharerProductApi;
import com.wxstore.league.headsupplier.api.sharer.SharerVideoApi;
import com.wxstore.league.headsupplier.http.ApiExecutor;

/**
 * 推客带货接口入口（按子模块拆分）。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/sharer/">官方文档</a>
 */
public final class SharerApi {

    private final SharerAccountApi account;
    private final SharerProductApi product;
    private final SharerCouponApi coupon;
    private final SharerLiveApi live;
    private final SharerVideoApi video;
    private final SharerArticleApi article;
    private final SharerClueApi clue;

    public SharerApi(ApiExecutor executor) {
        this.account = new SharerAccountApi(executor);
        this.product = new SharerProductApi(executor);
        this.coupon = new SharerCouponApi(executor);
        this.live = new SharerLiveApi(executor);
        this.video = new SharerVideoApi(executor);
        this.article = new SharerArticleApi(executor);
        this.clue = new SharerClueApi(executor);
    }

    public SharerAccountApi account() {
        return account;
    }

    public SharerProductApi product() {
        return product;
    }

    public SharerCouponApi coupon() {
        return coupon;
    }

    public SharerLiveApi live() {
        return live;
    }

    public SharerVideoApi video() {
        return video;
    }

    public SharerArticleApi article() {
        return article;
    }

    public SharerClueApi clue() {
        return clue;
    }
}
