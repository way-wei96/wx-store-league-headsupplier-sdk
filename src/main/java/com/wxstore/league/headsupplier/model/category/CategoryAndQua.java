package com.wxstore.league.headsupplier.model.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryAndQua {

    private CategoryInfo cat;

    private QualificationInfo qua;

    @JsonProperty("product_qua")
    private QualificationInfo productQua;

    @JsonProperty("brand_qua")
    private QualificationInfo brandQua;

    @JsonProperty("product_qua_list")
    private List<QualificationInfo> productQuaList;

    @JsonProperty("is_confidence_require_bad_must_pay")
    private Boolean isConfidenceRequireBadMustPay;

    public CategoryInfo getCat() {
        return cat;
    }

    public void setCat(CategoryInfo cat) {
        this.cat = cat;
    }

    public QualificationInfo getQua() {
        return qua;
    }

    public void setQua(QualificationInfo qua) {
        this.qua = qua;
    }

    public QualificationInfo getProductQua() {
        return productQua;
    }

    public void setProductQua(QualificationInfo productQua) {
        this.productQua = productQua;
    }

    public QualificationInfo getBrandQua() {
        return brandQua;
    }

    public void setBrandQua(QualificationInfo brandQua) {
        this.brandQua = brandQua;
    }

    public List<QualificationInfo> getProductQuaList() {
        return productQuaList;
    }

    public void setProductQuaList(List<QualificationInfo> productQuaList) {
        this.productQuaList = productQuaList;
    }

    public Boolean getIsConfidenceRequireBadMustPay() {
        return isConfidenceRequireBadMustPay;
    }

    public void setIsConfidenceRequireBadMustPay(Boolean isConfidenceRequireBadMustPay) {
        this.isConfidenceRequireBadMustPay = isConfidenceRequireBadMustPay;
    }
}
