package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/** 可推广商品详情（get_promote_product_detail 返回的 product 对象）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromoteProductDetail {

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("product_promotion_link")
    private String productPromotionLink;

    @JsonProperty("product_info")
    private ProductInfo productInfo;

    @JsonProperty("commission_info")
    private CommissionInfo commissionInfo;

    @JsonProperty("head_supplier_info")
    private HeadSupplierInfo headSupplierInfo;

    public String getShopAppid() {
        return shopAppid;
    }

    public void setShopAppid(String shopAppid) {
        this.shopAppid = shopAppid;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductPromotionLink() {
        return productPromotionLink;
    }

    public void setProductPromotionLink(String productPromotionLink) {
        this.productPromotionLink = productPromotionLink;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public CommissionInfo getCommissionInfo() {
        return commissionInfo;
    }

    public void setCommissionInfo(CommissionInfo commissionInfo) {
        this.commissionInfo = commissionInfo;
    }

    public HeadSupplierInfo getHeadSupplierInfo() {
        return headSupplierInfo;
    }

    public void setHeadSupplierInfo(HeadSupplierInfo headSupplierInfo) {
        this.headSupplierInfo = headSupplierInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductInfo {

        @JsonProperty("title")
        private String title;

        @JsonProperty("sub_title")
        private String subTitle;

        @JsonProperty("head_imgs")
        private List<String> headImgs;

        @JsonProperty("status")
        private Integer status;

        @JsonProperty("product_promotion_link")
        private String productPromotionLink;

        @JsonProperty("skus")
        private List<SkuInfo> skus;

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

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getProductPromotionLink() {
            return productPromotionLink;
        }

        public void setProductPromotionLink(String productPromotionLink) {
            this.productPromotionLink = productPromotionLink;
        }

        public List<SkuInfo> getSkus() {
            return skus;
        }

        public void setSkus(List<SkuInfo> skus) {
            this.skus = skus;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SkuInfo {

        @JsonProperty("sku_id")
        private String skuId;

        @JsonProperty("thumb_img")
        private String thumbImg;

        @JsonProperty("sale_price")
        private Integer salePrice;

        @JsonProperty("stock_num")
        private Integer stockNum;

        public String getSkuId() {
            return skuId;
        }

        public void setSkuId(String skuId) {
            this.skuId = skuId;
        }

        public String getThumbImg() {
            return thumbImg;
        }

        public void setThumbImg(String thumbImg) {
            this.thumbImg = thumbImg;
        }

        public Integer getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(Integer salePrice) {
            this.salePrice = salePrice;
        }

        public Integer getStockNum() {
            return stockNum;
        }

        public void setStockNum(Integer stockNum) {
            this.stockNum = stockNum;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CommissionInfo {

        @JsonProperty("status")
        private Integer status;

        @JsonProperty("service_ratio")
        private Long serviceRatio;

        @JsonProperty("start_time")
        private Long startTime;

        @JsonProperty("end_time")
        private Long endTime;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Long getServiceRatio() {
            return serviceRatio;
        }

        public void setServiceRatio(Long serviceRatio) {
            this.serviceRatio = serviceRatio;
        }

        public Long getStartTime() {
            return startTime;
        }

        public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        public Long getEndTime() {
            return endTime;
        }

        public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class HeadSupplierInfo {

        @JsonProperty("head_supplier_appid")
        private String headSupplierAppid;

        @JsonProperty("name")
        private String name;

        public String getHeadSupplierAppid() {
            return headSupplierAppid;
        }

        public void setHeadSupplierAppid(String headSupplierAppid) {
            this.headSupplierAppid = headSupplierAppid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
