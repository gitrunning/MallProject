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

@Table(name = "tb_category")
public class Category implements Serializable {
    @Id
    private Integer typeId;
    @NotNull(message = "typePid can not null")
    private Integer typePid;
    @NotNull(message = "typeName can not null")
    private String typeName;

    public Category() {
    }

    public Category(Integer typeId, @NotNull(message = "typePid can not null") Integer typePid, @NotNull(message = "typeName can not null") String typeName) {
        this.typeId = typeId;
        this.typePid = typePid;
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypePid() {
        return typePid;
    }

    public void setTypePid(Integer typePid) {
        this.typePid = typePid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
