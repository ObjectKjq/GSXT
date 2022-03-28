package com.gsxt.pojo;

import java.io.Serializable;

//文章的收藏分类表
public class ArticleClassification implements Serializable {
    Integer id;
    Integer user_id;
    String name;
    String state;

    public ArticleClassification(Integer id, Integer user_id, String name, String state) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.state = state;
    }

    public ArticleClassification() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ArticleClassification{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
