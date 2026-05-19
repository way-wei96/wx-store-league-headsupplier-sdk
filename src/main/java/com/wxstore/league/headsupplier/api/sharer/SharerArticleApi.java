package com.wxstore.league.headsupplier.api.sharer;

import com.wxstore.league.headsupplier.WxSharerApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.sharer.article.SharerArticleBaseRequest;
import com.wxstore.league.headsupplier.model.sharer.article.SharerArticleListResponse;

/**
 * 推客带货 - 公众号文章推广。
 */
public final class SharerArticleApi {

    private final ApiExecutor executor;

    public SharerArticleApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public SharerArticleListResponse getShopMpArticleList(SharerArticleBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_SHOP_MP_ARTICLE_LIST, request, SharerArticleListResponse.class);
    }

    public SharerArticleListResponse getTalentBizArticleList(SharerArticleBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_TALENT_BIZ_ARTICLE_LIST, request, SharerArticleListResponse.class);
    }
}
