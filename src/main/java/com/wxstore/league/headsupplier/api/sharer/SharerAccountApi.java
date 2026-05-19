package com.wxstore.league.headsupplier.api.sharer;

import com.wxstore.league.headsupplier.WxSharerApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindSharerListRequest;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindSharerListResponse;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindShopListRequest;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindShopListResponse;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindShopPromoterListRequest;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindShopPromoterListResponse;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindTalentListRequest;
import com.wxstore.league.headsupplier.model.sharer.account.GetBindTalentListResponse;
import com.wxstore.league.headsupplier.model.sharer.account.GetPromoterRegisterAndBindStatusRequest;
import com.wxstore.league.headsupplier.model.sharer.account.GetPromoterRegisterAndBindStatusResponse;
import com.wxstore.league.headsupplier.model.sharer.account.SetSharerCommissionInfoRequest;
import com.wxstore.league.headsupplier.model.sharer.account.UnbindPromoterRequest;

/**
 * 推客带货 - 账号信息。
 */
public final class SharerAccountApi {

    private final ApiExecutor executor;

    public SharerAccountApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public GetPromoterRegisterAndBindStatusResponse getPromoterRegisterAndBindStatus(
            GetPromoterRegisterAndBindStatusRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_PROMOTER_REGISTER_AND_BIND_STATUS,
                request,
                GetPromoterRegisterAndBindStatusResponse.class);
    }

    public WxApiResponse setSharerCommissionInfo(SetSharerCommissionInfoRequest request) {
        return executor.post(WxSharerApiPaths.SET_SHARER_COMMISSION_INFO, request, WxApiResponse.class);
    }

    public GetBindSharerListResponse getBindSharerList(GetBindSharerListRequest request) {
        return executor.post(WxSharerApiPaths.GET_BIND_SHARER_LIST, request, GetBindSharerListResponse.class);
    }

    public WxApiResponse unbindPromoter(UnbindPromoterRequest request) {
        return executor.post(WxSharerApiPaths.UNBIND_PROMOTER, request, WxApiResponse.class);
    }

    public GetBindShopListResponse getBindShopList(GetBindShopListRequest request) {
        return executor.post(WxSharerApiPaths.GET_BIND_SHOP_LIST, request, GetBindShopListResponse.class);
    }

    public GetBindShopPromoterListResponse getBindShopPromoterList(GetBindShopPromoterListRequest request) {
        return executor.post(
                WxSharerApiPaths.GET_BIND_SHOP_PROMOTER_LIST, request, GetBindShopPromoterListResponse.class);
    }

    public GetBindTalentListResponse getBindTalentList(GetBindTalentListRequest request) {
        return executor.post(WxSharerApiPaths.GET_BIND_TALENT_LIST, request, GetBindTalentListResponse.class);
    }
}
