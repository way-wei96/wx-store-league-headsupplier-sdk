package com.wxstore.league.headsupplier.model.headsupplier;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 更新机构合作关系请求。
 *
 * <p>object_type：1 机构，2 店铺。机构侧 hs_update_type：1 邀请 2 通过 3 不通过 4 取消邀请 5 取消合作。
 * 店铺侧 shop_update_type：1 结束合作 2 拒绝 3 通过。
 */
public class UpdateHsRelationRequest {

    @JsonProperty("object_type")
    private Integer objectType;

    @JsonProperty("to_shop_appid")
    private String toShopAppid;

    @JsonProperty("to_head_supplier_appid")
    private String toHeadSupplierAppid;

    @JsonProperty("hs_update_type")
    private Integer hsUpdateType;

    @JsonProperty("shop_update_type")
    private Integer shopUpdateType;

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public String getToShopAppid() {
        return toShopAppid;
    }

    public void setToShopAppid(String toShopAppid) {
        this.toShopAppid = toShopAppid;
    }

    public String getToHeadSupplierAppid() {
        return toHeadSupplierAppid;
    }

    public void setToHeadSupplierAppid(String toHeadSupplierAppid) {
        this.toHeadSupplierAppid = toHeadSupplierAppid;
    }

    public Integer getHsUpdateType() {
        return hsUpdateType;
    }

    public void setHsUpdateType(Integer hsUpdateType) {
        this.hsUpdateType = hsUpdateType;
    }

    public Integer getShopUpdateType() {
        return shopUpdateType;
    }

    public void setShopUpdateType(Integer shopUpdateType) {
        this.shopUpdateType = shopUpdateType;
    }
}
