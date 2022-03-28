package com.gsxt.pojo;

import java.io.Serializable;

//用户收藏的表
public class ClassificationCollect implements Serializable {
    Integer id;
    Integer classififcation_id;
    Integer article_id;
    Integer state;

    public ClassificationCollect(Integer id, Integer classififcation_id, Integer article_id, Integer state) {
        this.id = id;
        this.classififcation_id = classififcation_id;
        this.article_id = article_id;
        this.state = state;
    }

    public ClassificationCollect() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassififcation_id() {
        return classififcation_id;
    }

    public void setClassififcation_id(Integer classififcation_id) {
        this.classififcation_id = classififcation_id;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ClassificationCollect{" +
                "id=" + id +
                ", classififcation_id=" + classififcation_id +
                ", article_id=" + article_id +
                ", state=" + state +
                '}';
    }
}
