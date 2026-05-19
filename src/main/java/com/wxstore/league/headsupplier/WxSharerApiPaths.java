package com.wxstore.league.headsupplier;

/**
 * 推客带货 API 路径索引。
 *
 * @see <a href="https://developers.weixin.qq.com/doc/store/leagueheadsupplier/api/sharer/">官方文档</a>
 */
public final class WxSharerApiPaths {

    private WxSharerApiPaths() {}

    // --- 账号信息 ---
    public static final String GET_PROMOTER_REGISTER_AND_BIND_STATUS =
            "/channels/ec/promoter/get_promoter_register_and_bind_status";
    public static final String SET_SHARER_COMMISSION_INFO =
            "/channels/ec/promoter/set_sharer_commission_info";
    public static final String GET_BIND_SHARER_LIST = "/channels/ec/promoter/get_bind_sharer_list";
    public static final String UNBIND_PROMOTER = "/channels/ec/promoter/headsupplier_unbind_promoter";
    public static final String GET_BIND_SHOP_LIST = "/channels/ec/promoter/get_bind_shop_list";
    public static final String GET_BIND_SHOP_PROMOTER_LIST =
            "/channels/ec/promoter/get_bind_shop_promoter_list";
    public static final String GET_BIND_TALENT_LIST = "/channels/ec/promoter/get_bind_talent_list";

    // --- 商品获取 ---
    public static final String GET_PRODUCT_PROMOTION_LINK_INFO =
            "/channels/ec/promoter/get_product_promotion_link_info";
    public static final String GET_PRODUCT_PROMOTION_QRCODE_INFO =
            "/channels/ec/promoter/get_product_promotion_qrcode_info";
    public static final String GET_PROMOTE_PRODUCT_DETAIL =
            "/channels/ec/promoter/get_promote_product_detail";
    public static final String GET_PROMOTE_PRODUCT_LIST = "/channels/ec/promoter/get_promote_product_list";
    public static final String GET_PROMOTER_SINGLE_PRODUCT_PROMOTION_INFO =
            "/channels/ec/promoter/get_promoter_single_product_promotion_info";
    public static final String GET_SHARER_PRODUCT_COMMISSION_INFO =
            "/channels/ec/promoter/get_sharer_product_commission_info";
    public static final String SET_SHARER_PRODUCT_COMMISSION_INFO =
            "/channels/ec/promoter/set_sharer_product_commission_info";
    public static final String GET_PROMOTER_PRODUCT_SHARE_STATS =
            "/channels/ec/league/headsupplier/promoteraction/getproductsharestats";

    // --- 机构推广券 ---
    public static final String GET_COOPERATIVE_COUPON_LIST =
            "/channels/ec/promoter/get_cooperative_coupon_list";
    public static final String GET_COUPON_DETAIL = "/channels/ec/promoter/get_coupon_detail";
    public static final String GET_COUPON_PROMOTER_SHARE_LINK =
            "/channels/ec/promoter/get_coupon_promoter_share_link";
    public static final String GET_COUPON_QR_CODE = "/channels/ec/promoter/get_coupon_qr_code";
    public static final String GET_COUPON_SHORT_LINK = "/channels/ec/promoter/get_coupon_short_link";
    public static final String GET_PUBLIC_COUPON_LIST = "/channels/ec/promoter/get_public_coupon_list";
    public static final String SET_COUPON_TO_HEADSUPPLIER =
            "/channels/ec/promoter/set_coupon_to_headsupplier";
    public static final String GET_COUPON_TO_HEADSUPPLIER =
            "/channels/ec/promoter/get_coupon_to_headsupplier";

    // --- 直播推广 ---
    public static final String GET_LIVE_PROTECTION_QRCODE =
            "/channels/ec/league/headsupplier/liveprotection/getqrcode";
    public static final String GET_LIVE_COMMISSION_PRODUCT_LIST =
            "/channels/ec/promoter/get_live_commission_product_list";
    public static final String GET_LIVE_NOTICE_RECORD_LIST =
            "/channels/ec/promoter/get_live_notice_record_list";
    public static final String GET_LIVE_NOTICE_RECORD_QR_CODE =
            "/channels/ec/promoter/get_live_notice_record_qr_code";
    public static final String GET_LIVE_NOTICE_RESERVATION_INFO =
            "/channels/ec/promoter/get_live_notice_reservation_info";
    public static final String GET_LIVE_RECORD_LIST = "/channels/ec/promoter/get_live_record_list";
    public static final String GET_LIVE_RECORD_QR_CODE = "/channels/ec/promoter/get_live_record_qr_code";
    public static final String GET_SHOP_LIVE_COMMISSION_PRODUCT_LIST =
            "/channels/ec/promoter/get_shop_live_commission_product_list";
    public static final String GET_SHOP_LIVE_NOTICE_RECORD_LIST =
            "/channels/ec/promoter/get_shop_live_notice_record_list";
    public static final String GET_SHOP_LIVE_NOTICE_RECORD_QR_CODE =
            "/channels/ec/promoter/get_shop_live_notice_record_qr_code";
    public static final String GET_SHOP_LIVE_RECORD_LIST = "/channels/ec/promoter/get_shop_live_record_list";
    public static final String GET_SHOP_LIVE_RECORD_QR_CODE =
            "/channels/ec/promoter/get_shop_live_record_qr_code";
    public static final String GET_SHOP_LIVE_NOTICE_PROMOTER_SHARE_LINK =
            "/channels/ec/promoter/get_shop_live_notice_promoter_share_link";
    public static final String GET_LIVE_NOTICE_PROMOTER_SHARE_LINK =
            "/channels/ec/promoter/get_live_notice_promoter_share_link";
    public static final String GET_LIVE_NOTICE_STATS =
            "/channels/ec/league/headsupplier/promoteraction/getlivenoticestats";
    public static final String GET_PROMOTER_LIVE_STATS =
            "/channels/ec/league/headsupplier/promoteraction/getlivestats";

    // --- 短视频推广 ---
    public static final String GET_FEED_LIST = "/channels/ec/promoter/get_feed_list";
    public static final String GET_FEED_PROMOTION_INFO = "/channels/ec/promoter/get_feed_promotion_info";
    public static final String GET_SHOP_FEED_LIST = "/channels/ec/promoter/get_shop_feed_list";
    public static final String GET_SHOP_FEED_PROMOTION_INFO =
            "/channels/ec/promoter/get_shop_feed_promotion_info";

    // --- 公众号文章推广 ---
    public static final String GET_SHOP_MP_ARTICLE_LIST = "/channels/ec/promoter/get_shop_mp_article_list";
    public static final String GET_TALENT_BIZ_ARTICLE_LIST =
            "/channels/ec/promoter/get_talent_biz_article_list";

    // --- 线索订单 ---
    public static final String GET_CLUE = "/channels/ec/league/headsupplier/clue/get";
    public static final String GET_CLUE_LIST = "/channels/ec/league/headsupplier/clue/list/get";
}
