package com.wxstore.league.headsupplier.model.sharer.account;

import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class GetBindTalentListRequest extends SharerPageRequest {

    public static GetBindTalentListRequest of(String nextKey, int pageSize) {
        GetBindTalentListRequest request = new GetBindTalentListRequest();
        request.setNextKey(nextKey);
        request.setPageSize(pageSize);
        return request;
    }
}
