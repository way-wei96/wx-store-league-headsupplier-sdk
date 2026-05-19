package com.wxstore.league.headsupplier.model.sharer.live;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharerLiveModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeLiveRecordList() throws Exception {
        String json =
                "{\"errcode\":0,\"live_record_list\":[{\"export_id\":\"e1\",\"description\":\"d\","
                        + "\"promoter_share_link\":\"link\"}]}";
        SharerLiveListResponse response = objectMapper.readValue(json, SharerLiveListResponse.class);
        assertEquals("e1", response.getLiveRecordList().get(0).getExportId());
    }

    @Test
    void deserializeLiveCommissionProductList() throws Exception {
        String json =
                "{\"errcode\":0,\"has_more\":true,\"next_key\":\"k\","
                        + "\"product_list\":[{\"product_id\":123,\"product_name\":\"n\",\"product_price\":100}]}";
        SharerLiveListResponse response = objectMapper.readValue(json, SharerLiveListResponse.class);
        assertEquals("k", response.getNextKey());
        assertEquals(123L, response.getProductList().get(0).getProductId());
    }

    @Test
    void deserializeLiveNoticeRecordList() throws Exception {
        String json =
                "{\"errcode\":0,\"live_notice_record_list\":[{\"notice_id\":\"n1\",\"start_time\":123}]}";
        SharerLiveListResponse response = objectMapper.readValue(json, SharerLiveListResponse.class);
        assertEquals("n1", response.getLiveNoticeRecordList().get(0).getNoticeId());
    }

    @Test
    void deserializeLiveNoticeStats() throws Exception {
        String json =
                "{\"errcode\":0,\"notice_count\":5,\"notice_user_count\":1,"
                        + "\"join_count\":3,\"join_user_count\":2}";
        SharerLiveStatsResponse response = objectMapper.readValue(json, SharerLiveStatsResponse.class);
        assertEquals(5L, response.getNoticeCount());
        assertEquals(2L, response.getJoinUserCount());
    }

    @Test
    void deserializePromoterLiveStats() throws Exception {
        String json =
                "{\"errcode\":0,\"share_count\":5,\"share_user_count\":1,"
                        + "\"join_count\":3,\"join_user_count\":2}";
        SharerLiveStatsResponse response = objectMapper.readValue(json, SharerLiveStatsResponse.class);
        assertEquals(5L, response.getShareCount());
    }
}
