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
@Table(name = "tb_category")
public class Category implements Serializable {
    @Id
    private Integer typeId;
    @NotNull(message = "typePid can not null")
    private Integer typePid;
    @NotNull(message = "typeName can not null")
    private String typeName;
}
