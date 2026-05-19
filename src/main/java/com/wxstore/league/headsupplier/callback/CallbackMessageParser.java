package com.wxstore.league.headsupplier.callback;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import com.wxstore.league.headsupplier.model.callback.ApiDiffEvent;
import com.wxstore.league.headsupplier.model.callback.CallbackEventMessage;
import com.wxstore.league.headsupplier.model.callback.CallbackEventTypes;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierCommissionOrderUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierItemUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierSubscribeProductBaseInfoUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.HeadSupplierSubscribeProductPlanInfoUpdateEvent;
import com.wxstore.league.headsupplier.model.callback.PromoterBindEvent;
import com.wxstore.league.headsupplier.model.callback.TalentWindowCancelAuthEvent;

/**
 * 将解密后的回调 JSON 解析为事件模型。
 *
 * <p>未知或暂未建模的事件类型可先用 {@link #parse(String)} 读取公共字段，或用 {@link #parseAs(String, Class)} 绑定自定义类型。
 */
public final class CallbackMessageParser {

    private final ObjectMapper objectMapper;

    public CallbackMessageParser() {
        this(JsonMapperFactory.create());
    }

    public CallbackMessageParser(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String readEventType(String json) throws java.io.IOException {
        JsonNode root = objectMapper.readTree(json);
        JsonNode event = root.get("Event");
        return event == null || event.isNull() ? null : event.asText();
    }

    public CallbackEventMessage parse(String json) throws java.io.IOException {
        String eventType = readEventType(json);
        if (CallbackEventTypes.PROMOTER_BIND_RESULT.equals(eventType)) {
            return parseAs(json, PromoterBindEvent.class);
        }
        if (CallbackEventTypes.HEAD_SUPPLIER_COMMISSION_ORDER_UPDATE.equals(eventType)) {
            return parseAs(json, HeadSupplierCommissionOrderUpdateEvent.class);
        }
        if (CallbackEventTypes.HEAD_SUPPLIER_ITEM_UPDATE.equals(eventType)) {
            return parseAs(json, HeadSupplierItemUpdateEvent.class);
        }
        if (CallbackEventTypes.HEAD_SUPPLIER_SUBSCRIBE_PRODUCT_BASEINFO_UPDATE.equals(eventType)) {
            return parseAs(json, HeadSupplierSubscribeProductBaseInfoUpdateEvent.class);
        }
        if (CallbackEventTypes.HEAD_SUPPLIER_SUBSCRIBE_PRODUCT_PLANINFO_UPDATE.equals(eventType)) {
            return parseAs(json, HeadSupplierSubscribeProductPlanInfoUpdateEvent.class);
        }
        if (CallbackEventTypes.TALENT_WINDOW_CANCEL_AUTH.equals(eventType)) {
            return parseAs(json, TalentWindowCancelAuthEvent.class);
        }
        if (CallbackEventTypes.API_DIFF.equals(eventType)) {
            return parseAs(json, ApiDiffEvent.class);
        }
        return parseAs(json, CallbackEventMessage.class);
    }

    public <T extends CallbackEventMessage> T parseAs(String json, Class<T> type) throws java.io.IOException {
        return objectMapper.readValue(json, type);
    }
}
