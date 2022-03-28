package com.gsxt.pojo;

import java.io.Serializable;

//16、用户之间传递消息的表
public class UserUser implements Serializable {

    Integer id;
    Integer send_id;
    Integer receive_id;
    String content;
    Integer state;

    public UserUser(Integer id, Integer send_id, Integer receive_id, String content, Integer state) {
        this.id = id;
        this.send_id = send_id;
        this.receive_id = receive_id;
        this.content = content;
        this.state = state;
    }

    public UserUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSend_id() {
        return send_id;
    }

    public void setSend_id(Integer send_id) {
        this.send_id = send_id;
    }

    public Integer getReceive_id() {
        return receive_id;
    }

    public void setReceive_id(Integer receive_id) {
        this.receive_id = receive_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserUser{" +
                "id=" + id +
                ", send_id=" + send_id +
                ", receive_id=" + receive_id +
                ", content='" + content + '\'' +
                ", state=" + state +
                '}';
    }
}
