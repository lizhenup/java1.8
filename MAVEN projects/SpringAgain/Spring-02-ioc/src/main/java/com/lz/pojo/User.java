package com.lz.pojo;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/30 15:23
 * @description：
 * @modified By：
 * @version: $
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("show"+ name);
    }
}
