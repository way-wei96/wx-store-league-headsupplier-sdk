package com.wxstore.league.headsupplier.model.sharer.clue;

import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class GetClueListRequest extends SharerPageRequest {

    public static GetClueListRequest of(String nextKey, int pageSize) {
        GetClueListRequest request = new GetClueListRequest();
        request.setNextKey(nextKey);
        request.setPageSize(pageSize);
        return request;
    }
}
