package com.wxstore.league.headsupplier;

/**
 * 达人带货 API 路径索引。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/opentalent/">官方文档</a>
 */
public final class WxOpenTalentApiPaths {

    private WxOpenTalentApiPaths() {}

    // --- 橱窗管理 ---
    public static final String WINDOW_ADD = "/channels/ec/league/headsupplier/window/add";
    public static final String WINDOW_AUTH_GET = "/channels/ec/league/headsupplier/windowauth/get";
    public static final String WINDOW_AUTH_STATUS_GET =
            "/channels/ec/league/headsupplier/windowauth/status/get";
    public static final String WINDOW_GET_DETAIL = "/channels/ec/league/headsupplier/window/getdetail";
    public static final String WINDOW_GET_ALL = "/channels/ec/league/headsupplier/window/getall";
    public static final String WINDOW_REMOVE = "/channels/ec/league/headsupplier/window/remove";

    // --- 商品获取 ---
    public static final String COOPERATIVE_ITEM_LIST_GET =
            "/channels/ec/league/headsupplier/cooperativeitem/list/get";
    public static final String SELECTION_PRODUCTS_LIST_GET =
            "/channels/ec/league/headsupplier/selectionproducts/list/get";
    public static final String ITEM_PROMOTION_DETAIL_GET =
            "/channels/ec/league/headsupplier/item/promotiondetail/get";
    public static final String SUB_ITEM_ADD = "/channels/ec/league/headsupplier/subitem/add";
    public static final String SUB_ITEM_LIST_GET = "/channels/ec/league/headsupplier/subitem/list/get";
    public static final String COOPERATIVE_ITEM_ADD = "/channels/ec/league/headsupplier/cooperativeitem/add";
    public static final String SECOND_HEADSUPPLIER_ITEM_ADD =
            "/channels/ec/league/headsupplier/secondheadsupplieritem/add";
    public static final String SECOND_HEADSUPPLIER_ITEM_LIST_GET =
            "/channels/ec/league/headsupplier/secondheadsupplieritem/getlist";
    public static final String SECOND_HEADSUPPLIER_ITEM_UPDATE =
            "/channels/ec/league/headsupplier/secondheadsupplieritem/update";
}
