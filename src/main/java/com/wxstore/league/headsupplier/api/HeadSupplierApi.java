package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.WxApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopListRequest;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopListResponse;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopLockTimeRequest;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopLockTimeResponse;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopRequest;
import com.wxstore.league.headsupplier.model.headsupplier.GetShopResponse;
import com.wxstore.league.headsupplier.model.headsupplier.UpdateHsRelationRequest;

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
     * 获取合作小店详情。
     */
    public GetShopResponse getShop(GetShopRequest request) {
        return executor.post(WxApiPaths.GET_SHOP, request, GetShopResponse.class);
    }

    /**
     * 获取合作小店列表。
     */
    public GetShopListResponse getShopList(GetShopListRequest request) {
        return executor.post(WxApiPaths.GET_SHOP_LIST, request, GetShopListResponse.class);
    }

    /**
     * 获取店铺自定义的推广锁客时效。
     */
    public GetShopLockTimeResponse getShopLockTime(GetShopLockTimeRequest request) {
        return executor.post(WxApiPaths.GET_SHOP_LOCK_TIME, request, GetShopLockTimeResponse.class);
    }

    /**
     * 更新机构合作关系（接受/拒绝/取消合作等）。
     */
    public WxApiResponse updateHsRelation(UpdateHsRelationRequest request) {
        return executor.post(WxApiPaths.UPDATE_HS_RELATION, request, WxApiResponse.class);
    }
}
