package com.wxstore.league.headsupplier.api;

import com.wxstore.league.headsupplier.WxApiPaths;
import com.wxstore.league.headsupplier.http.ApiExecutor;
import com.wxstore.league.headsupplier.model.common.WxApiResponse;
import com.wxstore.league.headsupplier.model.shop.GetProductActivityRequest;
import com.wxstore.league.headsupplier.model.shop.GetProductActivityResponse;
import com.wxstore.league.headsupplier.model.shop.GetProductDetailRequest;
import com.wxstore.league.headsupplier.model.shop.GetProductDetailResponse;
import com.wxstore.league.headsupplier.model.shop.GetSubscribeProductListRequest;
import com.wxstore.league.headsupplier.model.shop.GetSubscribeProductListResponse;
import com.wxstore.league.headsupplier.model.shop.ProductIdRequest;

/**
 * 商品接口。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/shop/">官方文档</a>
 */
public final class ShopApi {

    private final ApiExecutor executor;

    public ShopApi(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * 获取商品基础详情。
     */
    public GetProductDetailResponse getProductDetail(GetProductDetailRequest request) {
        return executor.post(WxApiPaths.GET_PRODUCT_DETAIL, request, GetProductDetailResponse.class);
    }

    /**
     * 获取已订阅的商品列表。
     */
    public GetSubscribeProductListResponse getSubscribeProductList(GetSubscribeProductListRequest request) {
        return executor.post(WxApiPaths.GET_SUBSCRIBE_PRODUCTS, request, GetSubscribeProductListResponse.class);
    }

    /**
     * 订阅商品（基础信息/计划变更将触发回调）。
     */
    public WxApiResponse subscribeProduct(ProductIdRequest request) {
        return executor.post(WxApiPaths.SUBSCRIBE_PRODUCT, request, WxApiResponse.class);
    }

    /**
     * 取消商品订阅。
     */
    public WxApiResponse unsubscribeProduct(ProductIdRequest request) {
        return executor.post(WxApiPaths.UNSUBSCRIBE_PRODUCT, request, WxApiResponse.class);
    }

    /**
     * 获取商品活动补贴信息。
     */
    public GetProductActivityResponse getProductActivity(GetProductActivityRequest request) {
        return executor.post(WxApiPaths.GET_PRODUCT_ACTIVITY, request, GetProductActivityResponse.class);
    }
}
