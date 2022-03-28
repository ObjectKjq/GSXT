package com.gsxt.pojo;

import java.io.Serializable;

public class User implements Serializable {
    Integer id;
    String username;
    String password;
    String img_user;
    String phone;
    Integer state;

    public User(Integer id, String username, String password, String img_user, String phone, Integer state) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.img_user = img_user;
        this.phone = phone;
        this.state = state;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg_user() {
        return img_user;
    }

    public void setImg_user(String img_user) {
        this.img_user = img_user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", img_user='" + img_user + '\'' +
                ", phone='" + phone + '\'' +
                ", state=" + state +
                '}';
    }
}
