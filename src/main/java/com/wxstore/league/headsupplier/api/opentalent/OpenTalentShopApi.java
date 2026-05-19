package com.wxstore.league.headsupplier.api.opentalent;

import com.wxstore.league.headsupplier.WxOpenTalentApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentBaseRequest;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentDetailResponse;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentListResponse;

/**
 * 达人带货 - 商品获取。
 */
public final class OpenTalentShopApi {

    private final ApiExecutor executor;

    public OpenTalentShopApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public OpenTalentListResponse getCooperativeItemList(OpenTalentBaseRequest request) {
        return executor.post(
                WxOpenTalentApiPaths.COOPERATIVE_ITEM_LIST_GET, request, OpenTalentListResponse.class);
    }

    public OpenTalentListResponse listSelectionProducts(OpenTalentBaseRequest request) {
        return executor.post(
                WxOpenTalentApiPaths.SELECTION_PRODUCTS_LIST_GET, request, OpenTalentListResponse.class);
    }

    public OpenTalentDetailResponse getItemPromotionDetail(OpenTalentBaseRequest request) {
        return executor.post(
                WxOpenTalentApiPaths.ITEM_PROMOTION_DETAIL_GET, request, OpenTalentDetailResponse.class);
    }

    public WxApiResponse addSubItem(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.SUB_ITEM_ADD, request, WxApiResponse.class);
    }

    public OpenTalentListResponse getSubItemList(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.SUB_ITEM_LIST_GET, request, OpenTalentListResponse.class);
    }

    public WxApiResponse addCooperativeItem(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.COOPERATIVE_ITEM_ADD, request, WxApiResponse.class);
    }

    public WxApiResponse addSecondHeadSupplierItem(OpenTalentBaseRequest request) {
        return executor.post(
                WxOpenTalentApiPaths.SECOND_HEADSUPPLIER_ITEM_ADD, request, WxApiResponse.class);
    }

    public OpenTalentListResponse getSecondHeadSupplierItemList(OpenTalentBaseRequest request) {
        return executor.post(
                WxOpenTalentApiPaths.SECOND_HEADSUPPLIER_ITEM_LIST_GET, request, OpenTalentListResponse.class);
    }

    public WxApiResponse updateSecondHeadSupplierItem(OpenTalentBaseRequest request) {
        return executor.post(
                WxOpenTalentApiPaths.SECOND_HEADSUPPLIER_ITEM_UPDATE, request, WxApiResponse.class);
    }
}
