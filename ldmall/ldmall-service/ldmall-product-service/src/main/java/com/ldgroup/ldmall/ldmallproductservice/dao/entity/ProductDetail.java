package com.ldgroup.ldmall.ldmallproductservice.dao.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/3/31 21:33
 **/
@Data
@Table(name = "tb_product_detail")
public class ProductDetail implements Serializable {
    @Id
    private Integer detail_id;
    @NotNull(message = "product_detail can not null")
    private String product_detail;
}
