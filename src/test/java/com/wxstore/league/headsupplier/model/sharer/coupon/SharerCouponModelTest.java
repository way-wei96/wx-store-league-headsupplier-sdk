package com.wxstore.league.headsupplier.model.sharer.coupon;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharerCouponModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeCouponDetail() throws Exception {
        String json =
                "{\"errcode\":0,\"coupon\":{\"coupon_id\":\"c1\",\"coupon_name\":\"券\","
                        + "\"type\":1,\"status\":1,\"shop_appid\":\"wx_shop\"}}";
        SharerCouponDetailResponse response = objectMapper.readValue(json, SharerCouponDetailResponse.class);
        assertEquals("c1", response.getCoupon().getCouponId());
        assertEquals("券", response.getCoupon().getCouponName());
    }
}
