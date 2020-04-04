package com.ldgroup.ldmall.ldmallproductservice.dao.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/3/31 21:33
 **/
@Table(name = "tb_product_detail")
public class ProductDetail implements Serializable {
    @Id
    private Integer detail_id;
    @NotNull(message = "product_detail can not null")
    private String product_detail;

    public ProductDetail() {
    }

    public ProductDetail(Integer detail_id, @NotNull(message = "product_detail can not null") String product_detail) {
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
}
