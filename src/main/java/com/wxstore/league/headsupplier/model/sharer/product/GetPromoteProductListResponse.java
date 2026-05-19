package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPromoteProductListResponse extends SharerPageResponse {

    @JsonProperty("product_list")
    private List<PromoteProductItem> productList;

    public List<PromoteProductItem> getProductList() {
        return productList;
    }

    public void setProductList(List<PromoteProductItem> productList) {
        this.productList = productList;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PromoteProductItem {

        @JsonProperty("product_id")
        private Long productId;

        @JsonProperty("shop_appid")
        private String shopAppid;

        @JsonProperty("head_supplier_appid")
        private String headSupplierAppid;

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public String getShopAppid() {
            return shopAppid;
        }

        public void setShopAppid(String shopAppid) {
            this.shopAppid = shopAppid;
        }

        public String getHeadSupplierAppid() {
            return headSupplierAppid;
        }

        public void setHeadSupplierAppid(String headSupplierAppid) {
            this.headSupplierAppid = headSupplierAppid;
        }
    }
}
