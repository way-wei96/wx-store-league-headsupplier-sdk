package com.wxstore.league.headsupplier.model.sharer.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedInfo {

    @JsonProperty("export_id")
    private String exportId;

    @JsonProperty("talent_appid")
    private String talentAppid;

    @JsonProperty("predict_commission_amount")
    private Integer predictCommissionAmount;

    @JsonProperty("product_info")
    private FeedProductInfo productInfo;

    public String getExportId() {
        return exportId;
    }

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    public String getTalentAppid() {
        return talentAppid;
    }

    public void setTalentAppid(String talentAppid) {
        this.talentAppid = talentAppid;
    }

    public Integer getPredictCommissionAmount() {
        return predictCommissionAmount;
    }

    public void setPredictCommissionAmount(Integer predictCommissionAmount) {
        this.predictCommissionAmount = predictCommissionAmount;
    }

    public FeedProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(FeedProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FeedProductInfo {

        @JsonProperty("product_id")
        private Long productId;

        @JsonProperty("product_name")
        private String productName;

        @JsonProperty("product_img_url")
        private String productImgUrl;

        @JsonProperty("product_mini_price")
        private Integer productMiniPrice;

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductImgUrl() {
            return productImgUrl;
        }

        public void setProductImgUrl(String productImgUrl) {
            this.productImgUrl = productImgUrl;
        }

        public Integer getProductMiniPrice() {
            return productMiniPrice;
        }

        public void setProductMiniPrice(Integer productMiniPrice) {
            this.productMiniPrice = productMiniPrice;
        }
    }
}
