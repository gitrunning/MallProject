package com.ldgroup.ldmall.ldmallproductservice.dao.entity;

/*import ldshopv1.entity.ProductEntity;*/

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/3/31 21:33
 **/
@Table(name = "tb_product")
public class Product implements Serializable {
    @Id
    private Integer  productId;
    @NotNull(message = "productTitle can not null")
    private String productTitle;
    @NotNull(message = "cateId can not null")
    private Integer cateId;
    @NotNull(message = "productStock can not null")
    private Integer productStock;
    @NotNull(message = "productPrice can not null")
    private BigDecimal productPrice;
    @NotNull(message = "productSale can not null")
    private BigDecimal productSale;
    @NotNull(message = "productStatus can not null")
    private Integer productStatus;
    @NotNull(message = "isHot can not null")
    private Integer isHot;
    @NotNull(message = "isNew can not null")
    private Integer isNew;
    private String productImage;
    private String productBigimage;
    private String createUser;
    private LocalDateTime createTime;
    private String modifyUser;
    private LocalDateTime modifyTime;

    public Product() {
    }

    public Product(Integer productId, @NotNull(message = "productTitle can not null") String productTitle,
                   @NotNull(message = "cateId can not null") Integer cateId, @NotNull(message = "productStock can not null") Integer productStock,
                   @NotNull(message = "productPrice can not null") BigDecimal productPrice,
                   @NotNull(message = "productSale can not null") BigDecimal productSale,
                   @NotNull(message = "productStatus can not null") Integer productStatus,
                   @NotNull(message = "isHot can not null") Integer isHot, @NotNull(message = "isNew can not null") Integer isNew,
                   String productImage, String productBigimage, String createUser, LocalDateTime createTime, String modifyUser, LocalDateTime modifyTime) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.cateId = cateId;
        this.productStock = productStock;
        this.productPrice = productPrice;
        this.productSale = productSale;
        this.productStatus = productStatus;
        this.isHot = isHot;
        this.isNew = isNew;
        this.productImage = productImage;
        this.productBigimage = productBigimage;
        this.createUser = createUser;
        this.createTime = createTime;
        this.modifyUser = modifyUser;
        this.modifyTime = modifyTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductSale() {
        return productSale;
    }

    public void setProductSale(BigDecimal productSale) {
        this.productSale = productSale;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductBigimage() {
        return productBigimage;
    }

    public void setProductBigimage(String productBigimage) {
        this.productBigimage = productBigimage;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productTitle='" + productTitle + '\'' +
                ", cateId=" + cateId +
                ", productStock=" + productStock +
                ", productPrice=" + productPrice +
                ", productSale=" + productSale +
                ", productStatus=" + productStatus +
                ", isHot=" + isHot +
                ", isNew=" + isNew +
                ", productImage='" + productImage + '\'' +
                ", productBigimage='" + productBigimage + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", modifyUser='" + modifyUser + '\'' +
                ", modifyTime=" + modifyTime +
                '}';
    }

  /*  public ProductEntity convert(){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setCate_id(this.getCateId());
        productEntity.setCreate_time(this.getCreateTime());
        productEntity.setCreate_user(this.getCreateUser());
        productEntity.setIs_hot(this.getIsHot());
        productEntity.setModify_time(this.getModifyTime());
        productEntity.setModify_user(this.getModifyUser());
        productEntity.setProduct_bigimage(this.getProductBigimage());
        productEntity.setProduct_id(this.getProductId());
        productEntity.setProduct_image(this.getProductImage());
        productEntity.setProduct_price(this.getProductPrice());
        productEntity.setProduct_sale(this.getProductSale());
        productEntity.setProduct_status(this.getProductStatus());
        productEntity.setProduct_stock(this.getProductStock());
        productEntity.setProduct_title(this.getProductTitle());

        return productEntity;
    }*/



}
