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
}
