package com.wxstore.league.headsupplier.model.sharer.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageRequest;

public class SharerProductBaseRequest extends SharerPageRequest {

    public static SharerProductBaseRequest forPromoteProductDetail(
            String shopAppid, long productId, int planType) {
        SharerProductBaseRequest request = new SharerProductBaseRequest();
        request.setShopAppid(shopAppid);
        request.setProductId(productId);
        request.setPlanType(planType);
        return request;
    }

    public static SharerProductBaseRequest forPromoteProductList(int planType, int pageSize) {
        SharerProductBaseRequest request = new SharerProductBaseRequest();
        request.setPlanType(planType);
        request.setPageSize(pageSize);
        request.setNextKey("");
        return request;
    }

    @JsonProperty("sharer_appid")
    private String sharerAppid;

    @JsonProperty("shop_appid")
    private String shopAppid;

    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("head_supplier_appid")
    private String headSupplierAppid;

    @JsonProperty("plan_type")
    private Integer planType;

    @JsonProperty("get_available_coupon")
    private Boolean getAvailableCoupon;

    @JsonProperty("custom_token")
    private String customToken;

    @JsonProperty("keyword")
    private String keyword;

    @JsonProperty("from_head_supplier_appid")
    private String fromHeadSupplierAppid;

    @JsonProperty("spu_item_condition")
    private SpuItemCondition spuItemCondition;

    @JsonProperty("category")
    private ProductCategoryQuery category;

    public String getSharerAppid() {
        return sharerAppid;
    }

    public void setSharerAppid(String sharerAppid) {
        this.sharerAppid = sharerAppid;
    }

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

    public String getHeadSupplierAppid() {
        return headSupplierAppid;
    }

    public void setHeadSupplierAppid(String headSupplierAppid) {
        this.headSupplierAppid = headSupplierAppid;
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public Boolean getGetAvailableCoupon() {
        return getAvailableCoupon;
    }

    public void setGetAvailableCoupon(Boolean getAvailableCoupon) {
        this.getAvailableCoupon = getAvailableCoupon;
    }

    public String getCustomToken() {
        return customToken;
    }

    public void setCustomToken(String customToken) {
        this.customToken = customToken;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getFromHeadSupplierAppid() {
        return fromHeadSupplierAppid;
    }

    public void setFromHeadSupplierAppid(String fromHeadSupplierAppid) {
        this.fromHeadSupplierAppid = fromHeadSupplierAppid;
    }

    public SpuItemCondition getSpuItemCondition() {
        return spuItemCondition;
    }

    public void setSpuItemCondition(SpuItemCondition spuItemCondition) {
        this.spuItemCondition = spuItemCondition;
    }

    public ProductCategoryQuery getCategory() {
        return category;
    }

    public void setCategory(ProductCategoryQuery category) {
        this.category = category;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MinMaxRange {

        @JsonProperty("min")
        private Long min;

        @JsonProperty("max")
        private Long max;

        public Long getMin() {
            return min;
        }

        public void setMin(Long min) {
            this.min = min;
        }

        public Long getMax() {
            return max;
        }

        public void setMax(Long max) {
            this.max = max;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SpuItemCondition {

        @JsonProperty("selling_price_range")
        private MinMaxRange sellingPriceRange;

        @JsonProperty("monthly_sales_range")
        private MinMaxRange monthlySalesRange;

        @JsonProperty("service_fee_rate_range")
        private MinMaxRange serviceFeeRateRange;

        @JsonProperty("commission_rate_range")
        private MinMaxRange commissionRateRange;

        public MinMaxRange getSellingPriceRange() {
            return sellingPriceRange;
        }

        public void setSellingPriceRange(MinMaxRange sellingPriceRange) {
            this.sellingPriceRange = sellingPriceRange;
        }

        public MinMaxRange getMonthlySalesRange() {
            return monthlySalesRange;
        }

        public void setMonthlySalesRange(MinMaxRange monthlySalesRange) {
            this.monthlySalesRange = monthlySalesRange;
        }

        public MinMaxRange getServiceFeeRateRange() {
            return serviceFeeRateRange;
        }

        public void setServiceFeeRateRange(MinMaxRange serviceFeeRateRange) {
            this.serviceFeeRateRange = serviceFeeRateRange;
        }

        public MinMaxRange getCommissionRateRange() {
            return commissionRateRange;
        }

        public void setCommissionRateRange(MinMaxRange commissionRateRange) {
            this.commissionRateRange = commissionRateRange;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductCategoryQuery {

        @JsonProperty("category_id")
        private Long categoryId;

        @JsonProperty("category_name")
        private String categoryName;

        public Long getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }
    }
}
