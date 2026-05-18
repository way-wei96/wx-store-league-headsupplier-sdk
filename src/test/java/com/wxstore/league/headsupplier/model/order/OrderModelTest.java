package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class OrderModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetOrderResponseWithOfficialTypoField() throws Exception {
        String json =
                "{\"errcode\":0,\"errmsg\":\"ok\",\"commssion_order\":{\"order_id\":\"123\","
                        + "\"sku_id\":12345,\"status\":20,\"order_detail\":{\"commission_info\":"
                        + "{\"service_amount\":30,\"service_ratio\":300000}}}}";
        GetOrderResponse response = objectMapper.readValue(json, GetOrderResponse.class);
        assertNotNull(response.getCommissionOrder());
        assertEquals("123", response.getCommissionOrder().getOrderId());
        assertEquals(Long.valueOf(30), response.getCommissionOrder().getOrderDetail().getCommissionInfo().getServiceAmount());
    }

    @Test
    void deserializeGetOrderListResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"list\":[{\"order_id\":\"0\",\"sku_id\":100}],\"has_more\":false}";
        GetOrderListResponse response = objectMapper.readValue(json, GetOrderListResponse.class);
        assertEquals(1, response.getList().size());
        assertEquals("0", response.getList().get(0).getOrderId());
    }
}
