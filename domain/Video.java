package com.dana.pig.demopractice.domain;

import java.util.Date;

public class Video {
    private int id;
    private String title;
    private Date createTime;
    private User pushUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getPushUser() {
        return pushUser;
    }

    public void setPushUser(User pushUser) {
        this.pushUser = pushUser;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", pushUser=" + pushUser +
                '}';
    }
}
