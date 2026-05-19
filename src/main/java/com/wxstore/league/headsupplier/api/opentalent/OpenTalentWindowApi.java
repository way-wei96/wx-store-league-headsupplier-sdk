package com.wxstore.league.headsupplier.api.opentalent;

import com.wxstore.league.headsupplier.WxOpenTalentApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.opentalent.GetWindowAuthResponse;
import com.wxstore.league.headsupplier.model.opentalent.GetWindowAuthStatusResponse;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentBaseRequest;
import com.wxstore.league.headsupplier.model.opentalent.GetWindowDetailResponse;
import com.wxstore.league.headsupplier.model.opentalent.OpenTalentWindowListResponse;

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

    public GetWindowDetailResponse getWindowDetail(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_GET_DETAIL, request, GetWindowDetailResponse.class);
    }

    public OpenTalentWindowListResponse getAllWindow(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_GET_ALL, request, OpenTalentWindowListResponse.class);
    }

    public WxApiResponse removeWindow(OpenTalentBaseRequest request) {
        return executor.post(WxOpenTalentApiPaths.WINDOW_REMOVE, request, WxApiResponse.class);
    }
}
