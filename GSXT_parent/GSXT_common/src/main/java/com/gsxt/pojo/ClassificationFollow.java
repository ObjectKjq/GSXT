package com.gsxt.pojo;

import java.io.Serializable;

//用户关注用户表
public class ClassificationFollow implements Serializable {
    Integer id;
    Integer classification_id;
    Integer user_id;
    Integer state;

    public ClassificationFollow(Integer id, Integer classification_id, Integer user_id, Integer state) {
        this.id = id;
        this.classification_id = classification_id;
        this.user_id = user_id;
        this.state = state;
    }

    public ClassificationFollow() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassification_id() {
        return classification_id;
    }

    public void setClassification_id(Integer classification_id) {
        this.classification_id = classification_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ClassificationFollow{" +
                "id=" + id +
                ", classification_id=" + classification_id +
                ", user_id=" + user_id +
                ", state=" + state +
                '}';
    }
}
