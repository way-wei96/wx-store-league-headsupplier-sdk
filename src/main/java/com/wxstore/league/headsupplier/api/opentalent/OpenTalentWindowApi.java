package com.wxstore.league.headsupplier.api.opentalent;

import com.wxstore.league.headsupplier.WxOpenTalentApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.opentalent.GetWindowAuthResponse;
import com.wxstore.league.headsupplier.model.opentalent.GetWindowAuthStatusResponse;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentBaseRequest;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentDetailResponse;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentListResponse;

/**
 * 达人带货 - 橱窗管理。
 */
public final class OpenTalentWindowApi {

    private final ApiExecutor executor;

    public OpenTalentWindowApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public WxApiResponse addWindow(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_ADD, request, WxApiResponse.class);
    }

    public GetWindowAuthResponse getWindowAuth(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_AUTH_GET, request, GetWindowAuthResponse.class);
    }

    public GetWindowAuthStatusResponse getWindowAuthStatus(OpenTalentBaseRequest request) {
        return executor.post(
                WxOpenTalentApiPaths.WINDOW_AUTH_STATUS_GET, request, GetWindowAuthStatusResponse.class);
    }

    public OpenTalentDetailResponse getWindowDetail(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_GET_DETAIL, request, OpenTalentDetailResponse.class);
    }

    public OpenTalentListResponse getAllWindow(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_GET_ALL, request, OpenTalentListResponse.class);
    }

    public WxApiResponse removeWindow(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_REMOVE, request, WxApiResponse.class);
    }
}
