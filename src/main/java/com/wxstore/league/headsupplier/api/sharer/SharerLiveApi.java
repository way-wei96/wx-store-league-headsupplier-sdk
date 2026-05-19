package com.wxstore.league.headsupplier.api.sharer;

import com.wxstore.league.headsupplier.WxSharerApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.sharer.live.GetLiveNoticeReservationInfoResponse;
import com.wxstore.league.headsupplier.model.sharer.live.GetLiveProtectionQrcodeResponse;
import com.wxstore.league.headsupplier.model.sharer.live.SharerLiveBaseRequest;
import com.wxstore.league.headsupplier.model.sharer.live.SharerLiveListResponse;
import com.wxstore.league.headsupplier.model.sharer.live.SharerLivePromotionResponse;
import com.wxstore.league.headsupplier.model.sharer.live.SharerLiveStatsResponse;

/**
 * 推客带货 - 直播推广。
 */
public final class SharerLiveApi {

    private final ApiExecutor executor;

    public SharerLiveApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public GetLiveProtectionQrcodeResponse getLiveProtectionQrcode(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_LIVE_PROTECTION_QRCODE, request, GetLiveProtectionQrcodeResponse.class);
    }

    public SharerLiveListResponse getLiveCommissionProductList(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_LIVE_COMMISSION_PRODUCT_LIST, request, SharerLiveListResponse.class);
    }

    public SharerLiveListResponse getLiveNoticeRecordList(SharerLiveBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_LIVE_NOTICE_RECORD_LIST, request, SharerLiveListResponse.class);
    }

    public SharerLivePromotionResponse getLiveNoticeRecordQrCode(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_LIVE_NOTICE_RECORD_QR_CODE, request, SharerLivePromotionResponse.class);
    }

    public GetLiveNoticeReservationInfoResponse getLiveNoticeReservationInfo(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_LIVE_NOTICE_RESERVATION_INFO,
                request,
                GetLiveNoticeReservationInfoResponse.class);
    }

    public SharerLiveListResponse getLiveRecordList(SharerLiveBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_LIVE_RECORD_LIST, request, SharerLiveListResponse.class);
    }

    public SharerLivePromotionResponse getLiveRecordQrCode(SharerLiveBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_LIVE_RECORD_QR_CODE, request, SharerLivePromotionResponse.class);
    }

    public SharerLiveListResponse getShopLiveCommissionProductList(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_SHOP_LIVE_COMMISSION_PRODUCT_LIST, request, SharerLiveListResponse.class);
    }

    public SharerLiveListResponse getShopLiveNoticeRecordList(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_SHOP_LIVE_NOTICE_RECORD_LIST, request, SharerLiveListResponse.class);
    }

    public SharerLivePromotionResponse getShopLiveNoticeRecordQrCode(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_SHOP_LIVE_NOTICE_RECORD_QR_CODE, request, SharerLivePromotionResponse.class);
    }

    public SharerLiveListResponse getShopLiveRecordList(SharerLiveBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_SHOP_LIVE_RECORD_LIST, request, SharerLiveListResponse.class);
    }

    public SharerLivePromotionResponse getShopLiveRecordQrCode(SharerLiveBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_SHOP_LIVE_RECORD_QR_CODE, request, SharerLivePromotionResponse.class);
    }

    public SharerLivePromotionResponse getShopLiveNoticePromoterShareLink(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_SHOP_LIVE_NOTICE_PROMOTER_SHARE_LINK,
                request,
                SharerLivePromotionResponse.class);
    }

    public SharerLivePromotionResponse getLiveNoticePromoterShareLink(SharerLiveBaseRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_LIVE_NOTICE_PROMOTER_SHARE_LINK, request, SharerLivePromotionResponse.class);
    }

    public SharerLiveStatsResponse getLiveNoticeStats(SharerLiveBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_LIVE_NOTICE_STATS, request, SharerLiveStatsResponse.class);
    }

    public SharerLiveStatsResponse getPromoterLiveStats(SharerLiveBaseRequest request) {
        return executor.post(WxSharerApiPaths.GET_PROMOTER_LIVE_STATS, request, SharerLiveStatsResponse.class);
    }
}
