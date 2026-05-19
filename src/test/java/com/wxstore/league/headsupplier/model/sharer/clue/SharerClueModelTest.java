package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharerClueModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetClueResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"commssion_clue\":{\"order_id\":\"123\",\"sku_id\":12345,"
                        + "\"clue_detail\":{\"product_info\":{\"title\":\"test_123\"}}}}";
        GetClueResponse response = objectMapper.readValue(json, GetClueResponse.class);
        assertEquals("123", response.getCommissionClue().getOrderId());
        assertEquals("test_123", response.getCommissionClue().getClueDetail().getProductInfo().getTitle());
    }

    @Test
    void deserializeGetClueListResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"list\":[{\"order_id\":\"123\",\"sku_id\":1234}],\"has_more\":true}";
        GetClueListResponse response = objectMapper.readValue(json, GetClueListResponse.class);
        assertEquals("123", response.getList().get(0).getOrderId());
    }
}
