package com.wxstore.league.headsupplier.api.sharer;

import com.wxstore.league.headsupplier.WxSharerApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.sharer.clue.GetClueListRequest;
import com.wxstore.league.headsupplier.model.sharer.clue.GetClueListResponse;
import com.wxstore.league.headsupplier.model.sharer.clue.GetClueRequest;
import com.wxstore.league.headsupplier.model.sharer.clue.GetClueResponse;

/**
 * 推客带货 - 线索订单。
 */
public final class SharerClueApi {

    private final ApiExecutor executor;

    public SharerClueApi(ApiExecutor executor) {
        this.executor = executor;
    }

    public GetClueResponse getClue(GetClueRequest request) {
        return executor.post(WxSharerApiPaths.GET_CLUE, request, GetClueResponse.class);
    }

    public GetClueListResponse getClueList(GetClueListRequest request) {
        return executor.post(WxSharerApiPaths.GET_CLUE_LIST, request, GetClueListResponse.class);
    }
}
