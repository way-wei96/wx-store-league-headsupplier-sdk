package com.wxstore.league.headsupplier.callback;

import com.wxstore.league.headsupplier.model.callback.ApiDiffEvent;
import com.wxstore.league.headsupplier.model.callback.CallbackEventTypes;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierCommissionOrderUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierItemUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierSubscribeProductBaseInfoUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierSubscribeProductPlanInfoUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.PromoterBindEvent;
import com.wxstore.league.headsupplier.model.callback.TalentWindowCancelAuthEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class CallbackMessageParserTest {

    private final CallbackMessageParser parser = new CallbackMessageParser();

    @Test
    void parsePromoterBindEvent() throws Exception {
        String json =
                "{\"ToUserName\":\"gh_*\",\"FromUserName\":\"OPENID\",\"CreateTime\":1662480000,"
                        + "\"MsgType\":\"event\",\"Event\":\"promoter_bind_result\",\"bind_status\":1,"
                        + "\"sharer_appid\":\"12345\",\"sharer_openid\":\"ol0X\",\"sharer_unionid\":\"owdq\"}";
        var event = parser.parse(json);
        assertInstanceOf(PromoterBindEvent.class, event);
        PromoterBindEvent bind = (PromoterBindEvent) event;
        assertEquals(CallbackEventTypes.PROMOTER_BIND_RESULT, bind.getEvent());
        assertEquals(1, bind.getBindStatus());
        assertEquals("12345", bind.getSharerAppid());
    }

    @Test
    void parseHeadSupplierItemUpdateEvent() throws Exception {
        String json =
                "{\"Event\":\"head_supplier_item_update\",\"MsgType\":\"event\","
                        + "\"item_info\":{\"event_type\":2,\"appid\":\"APPID\",\"product_id\":\"12345\","
                        + "\"version\":\"1\",\"update_fields\":[\"commission_ratio\"]}}";
        var event = parser.parse(json);
        assertInstanceOf(HeadSupplierItemUpdateEvent.class, event);
        HeadSupplierItemUpdateEvent item = (HeadSupplierItemUpdateEvent) event;
        assertEquals("12345", item.getItemInfo().getProductId());
        assertEquals(2, item.getItemInfo().getEventType());
    }

    @Test
    void parseCommissionOrderUpdateEvent() throws Exception {
        String json =
                "{\"Event\":\"head_supplier_commission_order_update\",\"MsgType\":\"event\","
                        + "\"order_info\":{\"order_id\":\"123\",\"sku_id\":\"456\","
                        + "\"commission_order_status\":20,\"order_status\":20,\"version\":\"1\"}}";
        var event = parser.parse(json);
        assertInstanceOf(HeadSupplierCommissionOrderUpdateEvent.class, event);
        HeadSupplierCommissionOrderUpdateEvent order = (HeadSupplierCommissionOrderUpdateEvent) event;
        assertEquals("123", order.getOrderInfo().getOrderId());
        assertEquals(20, order.getOrderInfo().getCommissionOrderStatus());
    }

    @Test
    void parseTalentWindowCancelAuthEvent() throws Exception {
        String json =
                "{\"Event\":\"talent_window_cancel_auth\",\"MsgType\":\"event\","
                        + "\"item_info\":{\"talent_info\":{\"opentalentid\":\"t1\",\"nickname\":\"nick\"}}}";
        var event = parser.parse(json);
        assertInstanceOf(TalentWindowCancelAuthEvent.class, event);
        TalentWindowCancelAuthEvent auth = (TalentWindowCancelAuthEvent) event;
        assertEquals("t1", auth.getItemInfo().getTalentInfo().getOpentalentid());
        assertEquals("nick", auth.getItemInfo().getTalentInfo().getNickname());
    }

    @Test
    void parseSubscribeProductBaseInfoUpdateEvent() throws Exception {
        String json =
                "{\"Event\":\"head_supplier_subscribe_product_baseinfo_update\",\"MsgType\":\"event\","
                        + "\"item_info\":{\"appid\":\"wx_shop\",\"product_id\":\"1001\",\"version\":\"21\","
                        + "\"status\":5,\"product_info\":{\"title\":\"商品标题\"}}}";
        var event = parser.parse(json);
        assertInstanceOf(HeadSupplierSubscribeProductBaseInfoUpdateEvent.class, event);
        HeadSupplierSubscribeProductBaseInfoUpdateEvent base = (HeadSupplierSubscribeProductBaseInfoUpdateEvent) event;
        assertEquals("1001", base.getItemInfo().getProductId());
        assertEquals("商品标题", base.getItemInfo().getProductInfo().getTitle());
    }

    @Test
    void parseSubscribeProductPlanInfoUpdateEvent() throws Exception {
        String json =
                "{\"Event\":\"head_supplier_subscribe_product_planinfo_update\",\"MsgType\":\"event\","
                        + "\"item_info\":{\"event_type\":2,\"appid\":\"wx_shop\",\"product_id\":\"1001\","
                        + "\"plan_id\":\"2001\",\"commission_ratio\":200000}}";
        var event = parser.parse(json);
        assertInstanceOf(HeadSupplierSubscribeProductPlanInfoUpdateEvent.class, event);
        HeadSupplierSubscribeProductPlanInfoUpdateEvent plan = (HeadSupplierSubscribeProductPlanInfoUpdateEvent) event;
        assertEquals("2001", plan.getItemInfo().getPlanId());
        assertEquals(200000, plan.getItemInfo().getCommissionRatio());
    }

    @Test
    void parseApiDiffEvent() throws Exception {
        String json =
                "{\"Event\":\"api_diff\",\"MsgType\":\"event\","
                        + "\"api_diff_list\":[{\"api_name\":\"getorder\",\"change_type\":1,"
                        + "\"change_desc\":\"字段更新\"}]}";
        var event = parser.parse(json);
        assertInstanceOf(ApiDiffEvent.class, event);
        ApiDiffEvent diff = (ApiDiffEvent) event;
        assertEquals("getorder", diff.getApiDiffList().get(0).getApiName());
    }
}
