package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ShopModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeProductDetailWithItemField() throws Exception {
        String json =
                "{\"errcode\":0,\"item\":{\"product_id\":12345,\"product_info\":{\"title\":\"test\"}}}";
        GetProductDetailResponse response = objectMapper.readValue(json, GetProductDetailResponse.class);
        assertNotNull(response.getItem());
        assertEquals(Long.valueOf(12345), response.getItem().getProductId());
        assertEquals("test", response.getItem().getProductInfo().getTitle());
    }

    @Test
    void deserializeProductDetailWithProductAlias() throws Exception {
        String json = "{\"errcode\":0,\"product\":{\"product_id\":99}}";
        GetProductDetailResponse response = objectMapper.readValue(json, GetProductDetailResponse.class);
        assertEquals(Long.valueOf(99), response.getItem().getProductId());
    }

    @Test
    void deserializeSubscribeProductList() throws Exception {
        String json =
                "{\"errcode\":0,\"subscribe_info_list\":[{\"product_id\":100,\"shop_appid\":\"wx1\"}],"
                        + "\"has_more\":false}";
        GetSubscribeProductListResponse response =
                objectMapper.readValue(json, GetSubscribeProductListResponse.class);
        assertEquals(1, response.getSubscribeInfoList().size());
        assertEquals("wx1", response.getSubscribeInfoList().get(0).getShopAppid());
    }
}
