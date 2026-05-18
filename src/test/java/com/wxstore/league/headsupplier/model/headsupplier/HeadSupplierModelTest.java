package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HeadSupplierModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetShopResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"errmsg\":\"ok\",\"shop_detail\":{\"base_info\":{\"appid\":\"wxtest\","
                        + "\"nickname\":\"test\"},\"data_info\":{\"gmv\":1850},\"status\":2,\"approved_time\":100}}";
        GetShopResponse response = objectMapper.readValue(json, GetShopResponse.class);
        assertEquals(0, response.getErrcode().intValue());
        assertNotNull(response.getShopDetail());
        assertEquals("wxtest", response.getShopDetail().getBaseInfo().getAppid());
        assertEquals(Long.valueOf(1850), response.getShopDetail().getDataInfo().getGmv());
    }

    @Test
    void deserializeGetShopLockTimeResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"shopsetting_product_click_lock_day\":7,\"default_product_click_lock_day\":5}";
        GetShopLockTimeResponse response = objectMapper.readValue(json, GetShopLockTimeResponse.class);
        assertEquals(Integer.valueOf(7), response.getShopsettingProductClickLockDay());
        assertEquals(Integer.valueOf(5), response.getDefaultProductClickLockDay());
    }
}
