package com.jcohy.scis.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Description  :管理员表
 */

public class SortTest implements Serializable{

    private static final long serialVersionUID = 1L;

    //编号，使用此信息登录

    private String date;
    //名字

    private String time;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
