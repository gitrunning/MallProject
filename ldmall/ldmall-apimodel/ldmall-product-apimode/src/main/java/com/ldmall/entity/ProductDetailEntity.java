package com.ldmall.entity;

import java.io.Serializable;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/1 19:40
 **/
public class ProductDetailEntity implements Serializable {
    private Integer detail_id;
    private String product_detail;

    public ProductDetailEntity() {
    }

    public ProductDetailEntity(Integer detail_id, String product_detail) {
        this.detail_id = detail_id;
        this.product_detail = product_detail;
    }

    public Integer getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(Integer detail_id) {
        this.detail_id = detail_id;
    }

    public String getProduct_detail() {
        return product_detail;
    }

    public void setProduct_detail(String product_detail) {
        this.product_detail = product_detail;
    }

    @Override
    public String toString() {
        return "ProductDetailEntity{" +
                "detail_id=" + detail_id +
                ", product_detail='" + product_detail + '\'' +
                '}';
    }
}
