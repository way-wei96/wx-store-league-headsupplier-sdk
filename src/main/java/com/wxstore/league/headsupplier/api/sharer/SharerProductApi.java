package com.wxstore.league.headsupplier.api.sharer;

import com.wxstore.league.headsupplier.WxSharerApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.sharer.product.GetPromoteProductDetailResponse;
import com.wxstore.league.headsupplier.model.sharer.product.GetPromoteProductListResponse;
import com.wxstore.league.headsupplier.model.sharer.product.GetPromoterProductShareStatsResponse;
import com.wxstore.league.headsupplier.model.sharer.product.GetSharerProductCommissionInfoResponse;
import com.wxstore.league.headsupplier.model.sharer.product.SetSharerProductCommissionInfoRequest;
import com.wxstore.league.headsupplier.model.sharer.product.SharerProductBaseRequest;
import com.wxstore.league.headsupplier.model.sharer.product.SharerProductPromotionResponse;

/**
 * 推客带货 - 商品获取。
 */
public final class SharerProductApi {

    private final ApiExecutor executor;

    public SharerProductApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public SharerProductPromotionResponse getProductPromotionLinkInfo(SharerProductBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_PRODUCT_PROMOTION_LINK_INFO, request, SharerProductPromotionResponse.class);
    }

    public SharerProductPromotionResponse getProductPromotionQrcodeInfo(SharerProductBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_PRODUCT_PROMOTION_QRCODE_INFO, request, SharerProductPromotionResponse.class);
    }

    public GetPromoteProductDetailResponse getPromoteProductDetail(SharerProductBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_PROMOTE_PRODUCT_DETAIL, request, GetPromoteProductDetailResponse.class);
    }

    public GetPromoteProductListResponse getPromoteProductList(SharerProductBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_PROMOTE_PRODUCT_LIST, request, GetPromoteProductListResponse.class);
    }

    public SharerProductPromotionResponse getPromoterSingleProductPromotionInfo(SharerProductBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_PROMOTER_SINGLE_PRODUCT_PROMOTION_INFO,
                request,
                SharerProductPromotionResponse.class);
    }

    public GetSharerProductCommissionInfoResponse getSharerProductCommissionInfo(SharerProductBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_SHARER_PRODUCT_COMMISSION_INFO,
                request,
                GetSharerProductCommissionInfoResponse.class);
    }

    public WxApiResponse setSharerProductCommissionInfo(SetSharerProductCommissionInfoRequest request) {
        return executor.post(WxSharerApiPaths.SET_SHARER_PRODUCT_COMMISSION_INFO, request, WxApiResponse.class);
    }

    public GetPromoterProductShareStatsResponse getPromoterProductShareStats(SharerProductBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_PROMOTER_PRODUCT_SHARE_STATS,
                request,
                GetPromoterProductShareStatsResponse.class);
    }
}
