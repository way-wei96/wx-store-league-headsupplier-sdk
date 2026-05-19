package com.wxstore.league.headsupplier.model.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/** 订阅商品基础信息变更（head_supplier_subscribe_product_baseinfo_update）。 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadSupplierSubscribeProductBaseInfoUpdateEvent extends CallbackEventMessage {

    @JsonProperty("item_info")
    private ItemInfo itemInfo;

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ItemInfo {

        @JsonProperty("appid")
        private String appid;

        @JsonProperty("product_id")
        private String productId;

        @JsonProperty("version")
        private String version;

        @JsonProperty("status")
        private Integer status;

        @JsonProperty("product_info")
        private ProductInfo productInfo;

        @JsonProperty("sku_list")
        private List<SkuInfo> skuList;

        @JsonProperty("desc_info")
        private DescInfo descInfo;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public ProductInfo getProductInfo() {
            return productInfo;
        }

        public void setProductInfo(ProductInfo productInfo) {
            this.productInfo = productInfo;
        }

        public List<SkuInfo> getSkuList() {
            return skuList;
        }

        public void setSkuList(List<SkuInfo> skuList) {
            this.skuList = skuList;
        }

        public DescInfo getDescInfo() {
            return descInfo;
        }

        public void setDescInfo(DescInfo descInfo) {
            this.descInfo = descInfo;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductInfo {

        @JsonProperty("title")
        private String title;

        @JsonProperty("sub_title")
        private String subTitle;

        @JsonProperty("head_imgs")
        private List<String> headImgs;

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
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SkuInfo {

        @JsonProperty("sku_id")
        private Long skuId;

        @JsonProperty("sale_price")
        private Integer salePrice;

        @JsonProperty("stock_num")
        private Long stockNum;

        @JsonProperty("thumb_img")
        private String thumbImg;

        public Long getSkuId() {
            return skuId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Integer getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(Integer salePrice) {
            this.salePrice = salePrice;
        }

        public Long getStockNum() {
            return stockNum;
        }

        public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public String getThumbImg() {
            return thumbImg;
        }

        public void setThumbImg(String thumbImg) {
            this.thumbImg = thumbImg;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescInfo {

        @JsonProperty("imgs")
        private List<String> imgs;

        @JsonProperty("desc")
        private String desc;

        public List<String> getImgs() {
            return imgs;
        }

        public void setImgs(List<String> imgs) {
            this.imgs = imgs;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
