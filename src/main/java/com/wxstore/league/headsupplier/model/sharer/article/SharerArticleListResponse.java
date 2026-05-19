package com.wxstore.league.headsupplier.model.sharer.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wxstore.league.headsupplier.model.sharer.SharerPageResponse;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharerArticleListResponse extends SharerPageResponse {

    @JsonProperty("article_list")
    private List<MpArticleItem> articleList;

    public List<MpArticleItem> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<MpArticleItem> articleList) {
        this.articleList = articleList;
    }
}
