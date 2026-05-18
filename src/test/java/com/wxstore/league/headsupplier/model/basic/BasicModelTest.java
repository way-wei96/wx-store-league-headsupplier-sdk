package com.wxstore.league.headsupplier.model.basic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BasicModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetApiQuotaResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"quota\":{\"daily_limit\":1000,\"used\":10,\"remain\":990}}";
        GetApiQuotaResponse response = objectMapper.readValue(json, GetApiQuotaResponse.class);
        assertEquals(Long.valueOf(990), response.getQuota().getRemain());
    }

    @Test
    void deserializeGetIpListResponse() throws Exception {
        String json = "{\"errcode\":0,\"ip_list\":[\"1.2.3.4\"]}";
        GetIpListResponse response = objectMapper.readValue(json, GetIpListResponse.class);
        assertEquals(1, response.getIpList().size());
    }

    @Test
    void deserializeCallbackCheckResponse() throws Exception {
        String json =
                "{\"dns\":[{\"ip\":\"1.1.1.1\",\"real_operator\":\"UNICOM\"}],"
                        + "\"ping\":[{\"ip\":\"1.1.1.1\",\"package_loss\":\"0%\"}]}";
        CallbackCheckResponse response = objectMapper.readValue(json, CallbackCheckResponse.class);
        assertNotNull(response.getDns());
        assertEquals("0%", response.getPing().get(0).getPackageLoss());
    }
}
