package com.lz.pojo;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/31 23:42
 * @description：
 * @modified By：
 * @version: $
 */
public class User {
    private int id;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    private String password;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
