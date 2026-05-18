package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.WxApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.order.GetOrderListRequest;
import com.wxstore.league.headsupplier.model.order.GetOrderListResponse;
import com.wxstore.league.headsupplier.model.order.GetOrderRequest;
import com.wxstore.league.headsupplier.model.order.GetOrderResponse;

/**
 * 佣金单接口。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/order/">官方文档</a>
 */
public final class OrderApi {

    private final ApiExecutor executor;

    public OrderApi(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * 获取佣金单详情。
     */
    public GetOrderResponse getOrder(GetOrderRequest request) {
        return executor.post(WxApiPaths.GET_ORDER, request, GetOrderResponse.class);
    }

    /**
     * 获取佣金单列表。
     */
    public GetOrderListResponse getOrderList(GetOrderListRequest request) {
        return executor.post(WxApiPaths.GET_ORDER_LIST, request, GetOrderListResponse.class);
    }
}
