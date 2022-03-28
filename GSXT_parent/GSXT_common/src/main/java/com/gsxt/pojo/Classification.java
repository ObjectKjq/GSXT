package com.gsxt.pojo;

import java.io.Serializable;

//文章的分类表
public class Classification implements Serializable {
    Integer id;
    String name;
    Integer state;

    public Classification(Integer id, String name, Integer state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public Classification() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Classification{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
