package com.wxstore.league.headsupplier.model.sharer.clue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClueDetail {

    @JsonProperty("shop_info")
    private ShopInfo shopInfo;

    @JsonProperty("product_info")
    private ProductInfo productInfo;

    @JsonProperty("order_info")
    private OrderInfo orderInfo;

    @JsonProperty("sharer_info")
    private SharerInfo sharerInfo;

    @JsonProperty("buyer_info")
    private BuyerInfo buyerInfo;

    @JsonProperty("buyer")
    private BuyerInfo buyer;

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

    public SharerInfo getSharerInfo() {
        return sharerInfo;
    }

    public void setSharerInfo(SharerInfo sharerInfo) {
        this.sharerInfo = sharerInfo;
    }

    public BuyerInfo getBuyerInfo() {
        return buyerInfo != null ? buyerInfo : buyer;
    }

    public void setBuyerInfo(BuyerInfo buyerInfo) {
        this.buyerInfo = buyerInfo;
    }

    public BuyerInfo getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerInfo buyer) {
        this.buyer = buyer;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ShopInfo {

        @JsonProperty("appid")
        private String appid;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductInfo {

        @JsonProperty("product_id")
        private String productId;

        @JsonProperty("thumb_img")
        private String thumbImg;

        @JsonProperty("title")
        private String title;

        @JsonProperty("actual_payment")
        private Long actualPayment;

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
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
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OrderInfo {

        @JsonProperty("order_status")
        private Integer orderStatus;

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SharerInfo {

        @JsonProperty("sharer_appid")
        private String sharerAppid;

        @JsonProperty("nickname")
        private String nickname;

        @JsonProperty("opensharerid")
        private String opensharerid;

        public String getSharerAppid() {
            return sharerAppid;
        }

        public void setSharerAppid(String sharerAppid) {
            this.sharerAppid = sharerAppid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getOpensharerid() {
            return opensharerid;
        }

        public void setOpensharerid(String opensharerid) {
            this.opensharerid = opensharerid;
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
