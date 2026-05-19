package com.wxstore.league.headsupplier.api.sharer;

import com.wxstore.league.headsupplier.WxSharerApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.sharer.coupon.SharerCouponBaseRequest;
import com.wxstore.league.headsupplier.model.sharer.coupon.SharerCouponDetailResponse;
import com.wxstore.league.headsupplier.model.sharer.coupon.SharerCouponIdListResponse;
import com.wxstore.league.headsupplier.model.sharer.coupon.SharerCouponPromotionResponse;

/**
 * 推客带货 - 机构推广券。
 */
public final class SharerCouponApi {

    private final ApiExecutor executor;

    public SharerCouponApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public SharerCouponIdListResponse getCooperativeCouponList(SharerCouponBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_COOPERATIVE_COUPON_LIST, request, SharerCouponIdListResponse.class);
    }

    public SharerCouponDetailResponse getCouponDetail(SharerCouponBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_COUPON_DETAIL, request, SharerCouponDetailResponse.class);
    }

    public SharerCouponPromotionResponse getCouponPromoterShareLink(SharerCouponBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_COUPON_PROMOTER_SHARE_LINK, request, SharerCouponPromotionResponse.class);
    }

    public SharerCouponPromotionResponse getCouponQrCode(SharerCouponBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_COUPON_QR_CODE, request, SharerCouponPromotionResponse.class);
    }

    public SharerCouponPromotionResponse getCouponShortLink(SharerCouponBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_COUPON_SHORT_LINK, request, SharerCouponPromotionResponse.class);
    }

    public SharerCouponIdListResponse getPublicCouponList(SharerCouponBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_PUBLIC_COUPON_LIST, request, SharerCouponIdListResponse.class);
    }

    public WxApiResponse setCouponToHeadSupplier(SharerCouponBaseRequest request) {
        return executor.post(WxSharerApiPaths.SET_COUPON_TO_HEADSUPPLIER, request, WxApiResponse.class);
    }

    public SharerCouponIdListResponse getCouponToHeadSupplier(SharerCouponBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_COUPON_TO_HEADSUPPLIER, request, SharerCouponIdListResponse.class);
    }
}
