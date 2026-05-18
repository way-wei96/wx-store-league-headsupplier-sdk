package com.wxstore.league.headsupplier.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommissionOrderDetail {

    @JsonProperty("shop_info")
    private ShopInfo shopInfo;

    @JsonProperty("product_info")
    private ProductInfo productInfo;

    @JsonProperty("order_info")
    private OrderInfo orderInfo;

    @JsonProperty("commission_info")
    private CommissionInfo commissionInfo;

    @JsonProperty("buyer_info")
    private BuyerInfo buyerInfo;

    public ShopInfo getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(ShopInfo shopInfo) {
        this.shopInfo = shopInfo;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public CommissionInfo getCommissionInfo() {
        return commissionInfo;
    }

    public void setCommissionInfo(CommissionInfo commissionInfo) {
        this.commissionInfo = commissionInfo;
    }

    public BuyerInfo getBuyerInfo() {
        return buyerInfo;
    }

    public void setBuyerInfo(BuyerInfo buyerInfo) {
        this.buyerInfo = buyerInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ShopInfo {

        private String appid;

        @JsonProperty("shop_name")
        private String shopName;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductInfo {

        @JsonProperty("product_id")
        private Long productId;

        @JsonProperty("thumb_img")
        private String thumbImg;

        private String title;

        @JsonProperty("actual_payment")
        private Long actualPayment;

        @JsonProperty("product_cnt")
        private Integer productCnt;

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public String getThumbImg() {
            return thumbImg;
        }

        public void setThumbImg(String thumbImg) {
            this.thumbImg = thumbImg;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Long getActualPayment() {
            return actualPayment;
        }

        public void setActualPayment(Long actualPayment) {
            this.actualPayment = actualPayment;
        }

        public Integer getProductCnt() {
            return productCnt;
        }

        public void setProductCnt(Integer productCnt) {
            this.productCnt = productCnt;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OrderInfo {

        private Integer status;

        @JsonProperty("order_status")
        private Integer orderStatus;

        @JsonProperty("create_time")
        private Long createTime;

        @JsonProperty("pay_time")
        private Long payTime;

        @JsonProperty("update_time")
        private Long updateTime;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Long getPayTime() {
            return payTime;
        }

        public void setPayTime(Long payTime) {
            this.payTime = payTime;
        }

        public Long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BuyerInfo {

        @JsonProperty("open_id")
        private String openId;

        @JsonProperty("union_id")
        private String unionId;

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getUnionId() {
            return unionId;
        }

        public void setUnionId(String unionId) {
            this.unionId = unionId;
        }
    }
}
