package com.gsxt.pojo;

import java.io.Serializable;

//È¨ÏÞ±í
public class Permission implements Serializable {
    Integer id;
    String name;
    String url;
    Integer state;

    public Permission(Integer id, String name, String url, Integer state) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.state = state;
    }

    public Permission() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", state=" + state +
                '}';
    }
}
