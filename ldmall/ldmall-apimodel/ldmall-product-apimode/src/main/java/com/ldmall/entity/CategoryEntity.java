package com.ldmall.entity;

import java.io.Serializable;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/4/1 19:40
 **/
public class CategoryEntity implements Serializable {
    private Integer type_id;
    private Integer type_pid;
    private String type_name;

    public CategoryEntity() {
    }

    public CategoryEntity(Integer type_id, Integer type_pid, String type_name) {
        this.type_id = type_id;
        this.type_pid = type_pid;
        this.type_name = type_name;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getType_pid() {
        return type_pid;
    }

    public void setType_pid(Integer type_pid) {
        this.type_pid = type_pid;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "type_id=" + type_id +
                ", type_pid=" + type_pid +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
