package com.wxstore.league.headsupplier.model.category;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wxstore.league.headsupplier.http.JsonMapperFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CategoryModelTest {

    private final ObjectMapper objectMapper = JsonMapperFactory.create();

    @Test
    void deserializeGetAllCategoryResponse() throws Exception {
        String json =
                "{\"errcode\":0,\"cats\":[{\"cat_and_qua\":[{\"cat\":{\"cat_id\":\"1003\","
                        + "\"name\":\"假牙清洁\",\"level\":3}}]}],"
                        + "\"cats_v2\":[{\"cat_and_qua\":[{\"cat\":{\"cat_id\":\"545709\","
                        + "\"name\":\"公路电子收费/ETC/OBU\",\"leaf\":true}}]}]}";
        GetAllCategoryResponse response = objectMapper.readValue(json, GetAllCategoryResponse.class);
        assertEquals("假牙清洁", response.getCats().get(0).getCatAndQua().get(0).getCat().getName());
        assertTrue(response.getCatsV2().get(0).getCatAndQua().get(0).getCat().getLeaf());
    }
}
