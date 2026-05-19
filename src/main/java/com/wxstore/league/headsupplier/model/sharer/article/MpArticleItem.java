package com.wxstore.league.headsupplier.model.sharer.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MpArticleItem {

    @JsonProperty("article_info")
    private ArticleInfo articleInfo;

    @JsonProperty("product_list")
    private List<ArticleProductInfo> productList;

    @JsonProperty("create_time")
    private Long createTime;

    @JsonProperty("update_time")
    private Long updateTime;

    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(ArticleInfo articleInfo) {
        this.articleInfo = articleInfo;
    }

    public List<ArticleProductInfo> getProductList() {
        return productList;
    }

    public void setProductList(List<ArticleProductInfo> productList) {
        this.productList = productList;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArticleInfo {

        @JsonProperty("article_title")
        private String articleTitle;

        @JsonProperty("cover_image")
        private String coverImage;

        @JsonProperty("article_url")
        private String articleUrl;

        @JsonProperty("promoter_share_link")
        private String promoterShareLink;

        public String getArticleTitle() {
            return articleTitle;
        }

        public void setArticleTitle(String articleTitle) {
            this.articleTitle = articleTitle;
        }

        public String getCoverImage() {
            return coverImage;
        }

        public void setCoverImage(String coverImage) {
            this.coverImage = coverImage;
        }

        public String getArticleUrl() {
            return articleUrl;
        }

        public void setArticleUrl(String articleUrl) {
            this.articleUrl = articleUrl;
        }

        public String getPromoterShareLink() {
            return promoterShareLink;
        }

        public void setPromoterShareLink(String promoterShareLink) {
            this.promoterShareLink = promoterShareLink;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArticleProductInfo {

        @JsonProperty("product_id")
        private Long productId;

        @JsonProperty("product_name")
        private String productName;

        @JsonProperty("product_img_url")
        private String productImgUrl;

        @JsonProperty("predict_commission_amount")
        private Integer predictCommissionAmount;

        @JsonProperty("commission_rate")
        private Integer commissionRate;

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

        public Integer getPredictCommissionAmount() {
            return predictCommissionAmount;
        }

        public void setPredictCommissionAmount(Integer predictCommissionAmount) {
            this.predictCommissionAmount = predictCommissionAmount;
        }

        public Integer getCommissionRate() {
            return commissionRate;
        }

        public void setCommissionRate(Integer commissionRate) {
            this.commissionRate = commissionRate;
        }
    }
}
