package com.lz.pojo;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/30 15:23
 * @description：
 * @modified By：
 * @version: $
 */
public class UserT {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserT() {
        System.out.println("UserT");
    }

    public void show() {
        System.out.println("show"+ name);
    }
}
