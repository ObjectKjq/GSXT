package com.gsxt.pojo;

import java.io.Serializable;

//用户关注分类表
public class UserClassification implements Serializable {

    Integer id;
    Integer user_id;
    String name;
    Integer state;

    public UserClassification(Integer id, Integer user_id, String name, Integer state) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.state = state;
    }

    public UserClassification() {
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserClassification{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
