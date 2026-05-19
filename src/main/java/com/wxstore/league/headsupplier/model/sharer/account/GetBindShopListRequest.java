package com.wxstore.league.headsupplier.model.sharer.account;

import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class GetBindShopListRequest extends SharerPageRequest {

    public static GetBindShopListRequest of(String nextKey, int pageSize) {
        GetBindShopListRequest request = new GetBindShopListRequest();
        request.setNextKey(nextKey);
        request.setPageSize(pageSize);
        return request;
    }
}
