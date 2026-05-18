package com.wxstore.league.headsupplier;

/**
 * 官方 API 路径索引，便于扩展时查阅。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/">接口列表</a>
 */
public final class WxApiPaths {

    private WxApiPaths() {}

    // --- 基础 ---
    public static final String GET_ACCESS_TOKEN = "/cgi-bin/token";
    public static final String GET_STABLE_ACCESS_TOKEN = "/cgi-bin/stable_token";
    public static final String GET_API_QUOTA = "/cgi-bin/openapi/quota/get";
    public static final String CLEAR_QUOTA = "/cgi-bin/clear_quota";

    // --- 商品 ---
    public static final String GET_PRODUCT_DETAIL =
            "/channels/ec/league/headsupplier/productdetail/get";
    public static final String GET_SUBSCRIBE_PRODUCTS =
            "/channels/ec/league/headsupplier/subscription/getsubscribe";
    public static final String SUBSCRIBE_PRODUCT =
            "/channels/ec/league/headsupplier/subscription/subscribe";
    public static final String UNSUBSCRIBE_PRODUCT =
            "/channels/ec/league/headsupplier/subscription/unsubscribe";

    // --- 订单 ---
    public static final String GET_ORDER = "/channels/ec/league/headsupplier/order/get";
    public static final String GET_ORDER_LIST = "/channels/ec/league/headsupplier/order/list/get";

    // --- 资金 ---
    public static final String GET_BALANCE = "/channels/ec/league/headsupplier/funds/balance/get";
    public static final String GET_FUNDS_FLOW_DETAIL =
            "/channels/ec/league/headsupplier/funds/flowdetail/get";
    public static final String GET_FUNDS_FLOW_LIST =
            "/channels/ec/league/headsupplier/funds/flowlist/get";

    // --- 商家合作 ---
    public static final String GET_SHOP = "/channels/ec/league/headsupplier/shop/get";
    public static final String GET_SHOP_LIST = "/channels/ec/league/headsupplier/shop/list/get";
    public static final String GET_SHOP_LOCK_TIME =
            "/channels/ec/league/headsupplier/lockcustomertime/getlocktime";
    public static final String UPDATE_HS_RELATION =
            "/channels/ec/league/headsupplier/headsupplierrelation/update";
}
