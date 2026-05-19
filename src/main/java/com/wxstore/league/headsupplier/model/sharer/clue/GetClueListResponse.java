package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetClueListResponse extends SharerPageResponse {

    @JsonProperty("clue_list")
    private List<ClueListItem> clueList;

    public List<ClueListItem> getClueList() {
        return clueList;
    }

    public void setClueList(List<ClueListItem> clueList) {
        this.clueList = clueList;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ClueListItem {

        @JsonProperty("order_id")
        private String orderId;

        @JsonProperty("sku_id")
        private Long skuId;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }
    }
}
