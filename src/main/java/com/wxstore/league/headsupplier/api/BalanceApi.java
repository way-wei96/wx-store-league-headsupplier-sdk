package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.WxApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.balance.GetBalanceResponse;
import com.wxstore.league.headsupplier.model.balance.GetFundsFlowDetailRequest;
import com.wxstore.league.headsupplier.model.balance.GetFundsFlowDetailResponse;
import com.wxstore.league.headsupplier.model.balance.GetFundsFlowListRequest;
import com.wxstore.league.headsupplier.model.balance.GetFundsFlowListResponse;

/**
 * 资金接口。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/balance/">官方文档</a>
 */
public final class BalanceApi {

    private final ApiExecutor executor;

    public BalanceApi(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * 获取机构账户余额（可提现、待结算，单位：分）。
     */
    public GetBalanceResponse getBalance() {
        return executor.post(WxApiPaths.GET_BALANCE, null, GetBalanceResponse.class);
    }

    /**
     * 获取资金流水详情。
     */
    public GetFundsFlowDetailResponse getFundsFlowDetail(GetFundsFlowDetailRequest request) {
        return executor.post(WxApiPaths.GET_FUNDS_FLOW_DETAIL, request, GetFundsFlowDetailResponse.class);
    }

    /**
     * 获取资金流水列表（返回流水单号，可再调用详情接口查询）。
     */
    public GetFundsFlowListResponse getFundsFlowList(GetFundsFlowListRequest request) {
        return executor.post(WxApiPaths.GET_FUNDS_FLOW_LIST, request, GetFundsFlowListResponse.class);
    }
}
