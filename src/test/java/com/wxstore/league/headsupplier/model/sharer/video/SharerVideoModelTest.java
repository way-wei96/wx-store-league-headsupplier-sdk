package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharerVideoModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeFeedList() throws Exception {
        String json =
                "{\"errcode\":0,\"has_more\":false,\"next_key\":\"\","
                        + "\"feed_list\":[{\"export_id\":\"f1\",\"predict_commission_amount\":123,"
                        + "\"product_info\":{\"product_id\":1,\"product_name\":\"n\"}}]}";
        SharerVideoListResponse response = objectMapper.readValue(json, SharerVideoListResponse.class);
        assertEquals("f1", response.getFeedList().get(0).getExportId());
        assertEquals(1L, response.getFeedList().get(0).getProductInfo().getProductId());
    }
}
