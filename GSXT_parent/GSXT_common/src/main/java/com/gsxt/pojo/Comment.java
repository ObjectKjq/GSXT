package com.gsxt.pojo;

import java.io.Serializable;

//ÆÀÂÛ±í
public class Comment implements Serializable {
    Integer id;
    Integer article_id;
    Integer user_id;
    String content;
    Integer love_num;
    Integer state;

    public Comment(Integer id, Integer article_id, Integer user_id, String content, Integer love_num, Integer state) {
        this.id = id;
        this.article_id = article_id;
        this.user_id = user_id;
        this.content = content;
        this.love_num = love_num;
        this.state = state;
    }

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLove_num() {
        return love_num;
    }

    public void setLove_num(Integer love_num) {
        this.love_num = love_num;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", article_id=" + article_id +
                ", user_id=" + user_id +
                ", content='" + content + '\'' +
                ", love_num=" + love_num +
                ", state=" + state +
                '}';
    }
}
