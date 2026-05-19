package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OpenTalentModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetWindowAuthResponse() throws Exception {
        String json = "{\"errcode\":0,\"auth_url\":\"https://example.com/auth\"}";
        GetWindowAuthResponse response = objectMapper.readValue(json, GetWindowAuthResponse.class);
        assertEquals("https://example.com/auth", response.getAuthUrl());
    }

    @Test
    void serializeAddWindowRequest() throws Exception {
        OpenTalentBaseRequest request = new OpenTalentBaseRequest();
        request.setProductId(1234L);
        request.setOpenfinderid("ofid");
        request.setProductLink("https://link");
        String json = objectMapper.writeValueAsString(request);
        assertEquals(1234L, objectMapper.readTree(json).get("product_id").asLong());
        assertEquals("ofid", objectMapper.readTree(json).get("openfinderid").asText());
    }

    @Test
    void deserializeCooperativeItemListResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"list\":[{\"product_id\":1,\"id\":123,"
                        + "\"head_supplier_item_link\":\"weixinstore/10001\"}],\"next_key\":\"PAGE\"}";
        OpenTalentListResponse response = objectMapper.readValue(json, OpenTalentListResponse.class);
        assertEquals("PAGE", response.getNextKey());
        assertEquals(1L, response.getList().get(0).getProductId());
        assertEquals(123L, response.getList().get(0).getCooperativeItemId());
        assertEquals("weixinstore/10001", response.getList().get(0).getHeadSupplierItemLink());
    }

    @Test
    void deserializeGetWindowAuthStatusResponse() throws Exception {
        String json = "{\"errcode\":0,\"auth_status\":1}";
        GetWindowAuthStatusResponse response = objectMapper.readValue(json, GetWindowAuthStatusResponse.class);
        assertEquals(1, response.getAuthStatus());
    }

    @Test
    void deserializeWindowListResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"list\":[{\"appid\":\"test\",\"product_id\":12345,"
                        + "\"product_window_id\":99,\"is_operation_allowed\":true}],"
                        + "\"next_offset\":100,\"have_more\":true,\"total_num\":369}";
        OpenTalentWindowListResponse response = objectMapper.readValue(json, OpenTalentWindowListResponse.class);
        assertEquals(12345L, response.getList().get(0).getProductId());
        assertEquals(true, response.getHasMore());
        assertEquals(369, response.getTotalNum());
    }

    @Test
    void deserializeWindowDetailResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"product_detail\":{\"appid\":\"test\",\"product_id\":12345,"
                        + "\"product_info\":{\"title\":\"test_title\"}}}";
        GetWindowDetailResponse response = objectMapper.readValue(json, GetWindowDetailResponse.class);
        assertEquals("test_title", response.getProductDetail().getProductInfo().getTitle());
    }

    @Test
    void deserializeItemPromotionDetailResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"item\":{\"product_id\":1,\"shop_appid\":\"wx\","
                        + "\"commission_info\":{\"plan_type\":1,\"ratio\":100}}}";
        GetItemPromotionDetailResponse response =
                objectMapper.readValue(json, GetItemPromotionDetailResponse.class);
        assertEquals(1, response.getItem().getCommissionInfo().getPlanType());
    }
}
