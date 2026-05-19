package com.wxstore.league.headsupplier.model.sharer.article;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharerArticleModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeArticleList() throws Exception {
        String json =
                "{\"errcode\":0,\"article_list\":[{\"article_info\":{\"article_title\":\"title\","
                        + "\"article_url\":\"url\"},\"product_list\":[{\"product_id\":123}]}]}";
        SharerArticleListResponse response = objectMapper.readValue(json, SharerArticleListResponse.class);
        assertEquals("title", response.getArticleList().get(0).getArticleInfo().getArticleTitle());
        assertEquals(123L, response.getArticleList().get(0).getProductList().get(0).getProductId());
    }
}
