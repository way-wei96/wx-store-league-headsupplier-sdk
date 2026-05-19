package com.wxstore.league.headsupplier.model.opentalent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WindowProductDetail {

    @JsonProperty("appid")
    private String appid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("product_info")
    private ProductInfo productInfo;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductInfo {

        @JsonProperty("title")
        private String title;

        @JsonProperty("sub_title")
        private String subTitle;

        @JsonProperty("head_imgs")
        private List<String> headImgs;

        @JsonProperty("product_promotion_link")
        private String productPromotionLink;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public List<String> getHeadImgs() {
            return headImgs;
        }

        public void setHeadImgs(List<String> headImgs) {
            this.headImgs = headImgs;
        }

        public String getProductPromotionLink() {
            return productPromotionLink;
        }

        public void setProductPromotionLink(String productPromotionLink) {
            this.productPromotionLink = productPromotionLink;
        }
    }
}
