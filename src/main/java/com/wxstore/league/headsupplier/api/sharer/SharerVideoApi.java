package com.wxstore.league.headsupplier.api.sharer;

import com.wxstore.league.headsupplier.WxSharerApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.sharer.video.SharerVideoBaseRequest;
import com.wxstore.league.headsupplier.model.sharer.video.SharerVideoListResponse;
import com.wxstore.league.headsupplier.model.sharer.video.SharerVideoPromotionResponse;

/**
 * 推客带货 - 短视频推广。
 */
public final class SharerVideoApi {

    private final ApiExecutor executor;

    public SharerVideoApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public SharerVideoListResponse getFeedList(SharerVideoBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_FEED_LIST, request, SharerVideoListResponse.class);
    }

    public SharerVideoPromotionResponse getFeedPromotionInfo(SharerVideoBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_FEED_PROMOTION_INFO, request, SharerVideoPromotionResponse.class);
    }

    public SharerVideoListResponse getShopFeedList(SharerVideoBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_SHOP_FEED_LIST, request, SharerVideoListResponse.class);
    }

    public SharerVideoPromotionResponse getShopFeedPromotionInfo(SharerVideoBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_SHOP_FEED_PROMOTION_INFO, request, SharerVideoPromotionResponse.class);
    }
}
