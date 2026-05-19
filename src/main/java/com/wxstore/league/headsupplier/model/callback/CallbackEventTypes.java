package com.wxstore.league.headsupplier.model.callback;

/** 机构回调事件类型常量（Event 字段）。 */
public final class CallbackEventTypes {

    private CallbackEventTypes() {}

    /** API 变更日志 */
    public static final String API_DIFF = "api_diff";

    /** 机构商品变更 */
    public static final String HEAD_SUPPLIER_ITEM_UPDATE = "head_supplier_item_update";

    /** 佣金单变更 */
    public static final String HEAD_SUPPLIER_COMMISSION_ORDER_UPDATE =
            "head_supplier_commission_order_update";

    /** 订阅商品基础信息变更 */
    public static final String HEAD_SUPPLIER_SUBSCRIBE_PRODUCT_BASEINFO_UPDATE =
            "head_supplier_subscribe_product_baseinfo_update";

    /** 订阅商品计划信息变更 */
    public static final String HEAD_SUPPLIER_SUBSCRIBE_PRODUCT_PLANINFO_UPDATE =
            "head_supplier_subscribe_product_planinfo_update";

    /** 推客绑定/解绑 */
    public static final String PROMOTER_BIND_RESULT = "promoter_bind_result";

    /** 达人橱窗解除授权 */
    public static final String TALENT_WINDOW_CANCEL_AUTH = "talent_window_cancel_auth";
}
