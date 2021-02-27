package com.zhijieketang;

import java.io.Serializable;

public class User implements Serializable {

    int userid;
    String userName;

    public User() {
        this.userid = 0;
        this.userName = "";
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
