package com.lh.shiro.po;

import java.io.Serializable;

/**
 * Created by linghu on 17/04/09.
 */
public class Admin implements Serializable {
    private String id;

    private String userName;

    private String passWord;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
