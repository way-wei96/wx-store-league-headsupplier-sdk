package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopListRequest;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopListResponse;

/**
 * 商家合作接口。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/headsupplier/">官方文档</a>
 */
public final class HeadSupplierApi {

    private final ApiExecutor executor;

    public HeadSupplierApi(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * 获取合作小店列表。
     */
    public GetShopListResponse getShopList(GetShopListRequest request) {
        return executor.post(
                "/channels/ec/league/headsupplier/shop/list/get", request, GetShopListResponse.class);
    }
}
