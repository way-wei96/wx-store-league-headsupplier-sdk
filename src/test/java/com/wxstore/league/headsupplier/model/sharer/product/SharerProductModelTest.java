package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SharerProductModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializePromoteProductDetailResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"product\":{\"shop_appid\":\"test\",\"product_id\":12345,"
                        + "\"product_info\":{\"title\":\"test_title\",\"skus\":[{\"sku_id\":\"1\",\"sale_price\":500}]},"
                        + "\"commission_info\":{\"status\":1,\"service_ratio\":1}},"
                        + "\"publish_coupons\":[{\"coupon_id\":\"c1\"}]}";
        GetPromoteProductDetailResponse response = objectMapper.readValue(json, GetPromoteProductDetailResponse.class);
        assertEquals("test_title", response.getProduct().getProductInfo().getTitle());
        assertEquals(1, response.getProduct().getCommissionInfo().getStatus());
        assertEquals("c1", response.getPublishCoupons().get(0).getCouponId());
    }

    @Test
    void deserializePromoteProductListResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"product_list\":[{\"product_id\":1,\"shop_appid\":\"SHOP\","
                        + "\"head_supplier_appid\":\"HS\"}],\"next_key\":\"PAGE\"}";
        GetPromoteProductListResponse response = objectMapper.readValue(json, GetPromoteProductListResponse.class);
        assertEquals("PAGE", response.getNextKey());
        assertEquals("HS", response.getProductList().get(0).getHeadSupplierAppid());
    }

    @Test
    void serializeProductListRequest() throws Exception {
        SharerProductBaseRequest request = new SharerProductBaseRequest();
        request.setPlanType(1);
        request.setPageSize(10);
        request.setNextKey("");
        String json = objectMapper.writeValueAsString(request);
        assertEquals(1, objectMapper.readTree(json).get("plan_type").asInt());
        assertNotNull(objectMapper.readTree(json).get("page_size"));
    }
}
