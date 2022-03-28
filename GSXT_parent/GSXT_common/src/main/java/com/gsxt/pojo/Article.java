package com.gsxt.pojo;

import java.io.Serializable;

//文章表用于保存文章
public class Article implements Serializable {
    Integer id;
    String title;
    String content;
    String img_url;
    String video_url;
    String time;
    Integer user_id;
    Integer collect_num;
    Integer state;

    public Article(Integer id, String title, String content, String img_url, String video_url, String time, Integer user_id, Integer collect_num, Integer state) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.img_url = img_url;
        this.video_url = video_url;
        this.time = time;
        this.user_id = user_id;
        this.collect_num = collect_num;
        this.state = state;
    }

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getCollect_num() {
        return collect_num;
    }

    public void setCollect_num(Integer collect_num) {
        this.collect_num = collect_num;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img_url='" + img_url + '\'' +
                ", video_url='" + video_url + '\'' +
                ", time='" + time + '\'' +
                ", user_id=" + user_id +
                ", collect_num=" + collect_num +
                ", state=" + state +
                '}';
    }
}
