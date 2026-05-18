package com.wxstore.league.headsupplier.model.balance;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BalanceModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetBalanceResponse() throws Exception {
        String json = "{\"errcode\":0,\"available_amount\":45331,\"pending_amount\":7549}";
        GetBalanceResponse response = objectMapper.readValue(json, GetBalanceResponse.class);
        assertEquals(Long.valueOf(45331), response.getAvailableAmount());
        assertEquals(Long.valueOf(7549), response.getPendingAmount());
    }

    @Test
    void deserializeGetFundsFlowDetailResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"funds_flow\":{\"flow_id\":\"123\",\"funds_type\":2,\"amount\":4}}";
        GetFundsFlowDetailResponse response =
                objectMapper.readValue(json, GetFundsFlowDetailResponse.class);
        assertNotNull(response.getFundsFlow());
        assertEquals("123", response.getFundsFlow().getFlowId());
        assertEquals(Integer.valueOf(2), response.getFundsFlow().getFundsType());
    }

    @Test
    void deserializeGetFundsFlowListResponse() throws Exception {
        String json = "{\"errcode\":0,\"flow_ids\":[\"a\",\"b\"],\"has_more\":true}";
        GetFundsFlowListResponse response = objectMapper.readValue(json, GetFundsFlowListResponse.class);
        assertEquals(2, response.getFlowIds().size());
        assertEquals(Boolean.TRUE, response.getHasMore());
    }
}
