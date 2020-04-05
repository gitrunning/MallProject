package com.ldmall.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/1 0:12
 **/

public class ProductEntity implements Serializable {
    private Integer product_id;
    private String product_title;
    private Integer cate_id;
    private Integer product_stock;
    private BigDecimal product_price;
    private BigDecimal product_sale;
    private Integer product_status;
    private Integer is_hot;
    private Integer is_new;
    private String product_image;
    private String product_bigimage;
    private String create_user;
    private LocalDateTime create_time;
    private String modify_user;
    private LocalDateTime modify_time;

    public ProductEntity() {
    }

    public ProductEntity(Integer product_id, String product_title, Integer cate_id, Integer product_stock,
                         BigDecimal product_price, BigDecimal product_sale, Integer product_status, Integer is_hot,
                         Integer is_new, String product_image, String product_bigimage, String create_user,
                         LocalDateTime create_time, String modify_user, LocalDateTime modify_time) {
        this.product_id = product_id;
        this.product_title = product_title;
        this.cate_id = cate_id;
        this.product_stock = product_stock;
        this.product_price = product_price;
        this.product_sale = product_sale;
        this.product_status = product_status;
        this.is_hot = is_hot;
        this.is_new = is_new;
        this.product_image = product_image;
        this.product_bigimage = product_bigimage;
        this.create_user = create_user;
        this.create_time = create_time;
        this.modify_user = modify_user;
        this.modify_time = modify_time;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }

    public Integer getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(Integer product_stock) {
        this.product_stock = product_stock;
    }

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public BigDecimal getProduct_sale() {
        return product_sale;
    }

    public void setProduct_sale(BigDecimal product_sale) {
        this.product_sale = product_sale;
    }

    public Integer getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Integer product_status) {
        this.product_status = product_status;
    }

    public Integer getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(Integer is_hot) {
        this.is_hot = is_hot;
    }

    public Integer getIs_new() {
        return is_new;
    }

    public void setIs_new(Integer is_new) {
        this.is_new = is_new;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_bigimage() {
        return product_bigimage;
    }

    public void setProduct_bigimage(String product_bigimage) {
        this.product_bigimage = product_bigimage;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user;
    }

    public LocalDateTime getModify_time() {
        return modify_time;
    }

    public void setModify_time(LocalDateTime modify_time) {
        this.modify_time = modify_time;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "product_id=" + product_id +
                ", product_title='" + product_title + '\'' +
                ", cate_id=" + cate_id +
                ", product_stock=" + product_stock +
                ", product_price=" + product_price +
                ", product_sale=" + product_sale +
                ", product_status=" + product_status +
                ", is_hot=" + is_hot +
                ", is_new=" + is_new +
                ", product_image='" + product_image + '\'' +
                ", product_bigimage='" + product_bigimage + '\'' +
                ", create_user='" + create_user + '\'' +
                ", create_time=" + create_time +
                ", modify_user='" + modify_user + '\'' +
                ", modify_time=" + modify_time +
                '}';
    }
}
