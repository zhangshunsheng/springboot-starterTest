package com.dana.pig.demopractice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginUser {
    private String userid;
    private String username;
//    @JsonIgnore // 发送数据时忽略此属性
    private String password;

    public LoginUser(){};

    public LoginUser(String userid, String username, String password){
        this.userid = userid;
        this.username = username;
        this.password = password;
    };

    public LoginUser(String username, String password){
        this.username = username;
        this.password = password;
    };

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

}
