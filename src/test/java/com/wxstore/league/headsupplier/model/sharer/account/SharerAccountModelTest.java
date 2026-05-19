package com.wxstore.league.headsupplier.model.sharer.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharerAccountModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetBindSharerListResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"sharer_info_list\":[{\"sharer_appid\":\"wx1\",\"commission_type\":1}],"
                        + "\"next_key\":\"k1\"}";
        GetBindSharerListResponse response = objectMapper.readValue(json, GetBindSharerListResponse.class);
        assertEquals("wx1", response.getSharerInfoList().get(0).getSharerAppid());
        assertEquals("k1", response.getNextKey());
    }
}
