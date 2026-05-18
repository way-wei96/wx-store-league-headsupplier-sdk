package com.wxstore.league.headsupplier.model.shop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductItem {

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("product_info")
    private ProductInfo productInfo;

    private ShopInfo shop;

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

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public ShopInfo getShop() {
        return shop;
    }

    public void setShop(ShopInfo shop) {
        this.shop = shop;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductInfo {

        private String title;

        @JsonProperty("sub_title")
        private String subTitle;

        @JsonProperty("head_imgs")
        private List<String> headImgs;

        @JsonProperty("desc_info")
        private DescInfo descInfo;

        private List<ProductSku> skus;

        @JsonProperty("cats_v2")
        private List<ProductCategory> catsV2;

        private Integer status;

        @JsonProperty("monthly_sales_range")
        private Integer monthlySalesRange;

        @JsonProperty("extra_service")
        private ExtraService extraService;

        @JsonProperty("short_title")
        private String shortTitle;

        @JsonProperty("good_evaluation_ratio")
        private Long goodEvaluationRatio;

        @JsonProperty("is_brand_good")
        private Boolean isBrandGood;

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

        public DescInfo getDescInfo() {
            return descInfo;
        }

        public void setDescInfo(DescInfo descInfo) {
            this.descInfo = descInfo;
        }

        public List<ProductSku> getSkus() {
            return skus;
        }

        public void setSkus(List<ProductSku> skus) {
            this.skus = skus;
        }

        public List<ProductCategory> getCatsV2() {
            return catsV2;
        }

        public void setCatsV2(List<ProductCategory> catsV2) {
            this.catsV2 = catsV2;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getMonthlySalesRange() {
            return monthlySalesRange;
        }

        public void setMonthlySalesRange(Integer monthlySalesRange) {
            this.monthlySalesRange = monthlySalesRange;
        }

        public ExtraService getExtraService() {
            return extraService;
        }

        public void setExtraService(ExtraService extraService) {
            this.extraService = extraService;
        }

        public String getShortTitle() {
            return shortTitle;
        }

        public void setShortTitle(String shortTitle) {
            this.shortTitle = shortTitle;
        }

        public Long getGoodEvaluationRatio() {
            return goodEvaluationRatio;
        }

        public void setGoodEvaluationRatio(Long goodEvaluationRatio) {
            this.goodEvaluationRatio = goodEvaluationRatio;
        }

        public Boolean getIsBrandGood() {
            return isBrandGood;
        }

        public void setIsBrandGood(Boolean isBrandGood) {
            this.isBrandGood = isBrandGood;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DescInfo {

        private List<String> imgs;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductSku {

        @JsonProperty("sku_id")
        private Long skuId;

        @JsonProperty("thumb_img")
        private String thumbImg;

        @JsonProperty("sale_price")
        private Long salePrice;

        @JsonProperty("stock_num")
        private Long stockNum;

        @JsonProperty("sku_attrs")
        private List<SkuAttr> skuAttrs;

        public Long getSkuId() {
            return skuId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public String getThumbImg() {
            return thumbImg;
        }

        public void setThumbImg(String thumbImg) {
            this.thumbImg = thumbImg;
        }

        public Long getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
        }

        public Long getStockNum() {
            return stockNum;
        }

        public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public List<SkuAttr> getSkuAttrs() {
            return skuAttrs;
        }

        public void setSkuAttrs(List<SkuAttr> skuAttrs) {
            this.skuAttrs = skuAttrs;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SkuAttr {

        @JsonProperty("attr_key")
        private String attrKey;

        @JsonProperty("attr_value")
        private String attrValue;

        public String getAttrKey() {
            return attrKey;
        }

        public void setAttrKey(String attrKey) {
            this.attrKey = attrKey;
        }

        public String getAttrValue() {
            return attrValue;
        }

        public void setAttrValue(String attrValue) {
            this.attrValue = attrValue;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductCategory {

        @JsonProperty("cat_id")
        private Long catId;

        @JsonProperty("cat_name")
        private String catName;

        public Long getCatId() {
            return catId;
        }

        public void setCatId(Long catId) {
            this.catId = catId;
        }

        public String getCatName() {
            return catName;
        }

        public void setCatName(String catName) {
            this.catName = catName;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ExtraService {

        @JsonProperty("seven_day_return")
        private Integer sevenDayReturn;

        @JsonProperty("pay_after_use")
        private Integer payAfterUse;

        @JsonProperty("freight_insurance")
        private Integer freightInsurance;

        public Integer getSevenDayReturn() {
            return sevenDayReturn;
        }

        public void setSevenDayReturn(Integer sevenDayReturn) {
            this.sevenDayReturn = sevenDayReturn;
        }

        public Integer getPayAfterUse() {
            return payAfterUse;
        }

        public void setPayAfterUse(Integer payAfterUse) {
            this.payAfterUse = payAfterUse;
        }

        public Integer getFreightInsurance() {
            return freightInsurance;
        }

        public void setFreightInsurance(Integer freightInsurance) {
            this.freightInsurance = freightInsurance;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ShopInfo {

        private String name;
        private Long score;
        private String icon;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getScore() {
            return score;
        }

        public void setScore(Long score) {
            this.score = score;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
