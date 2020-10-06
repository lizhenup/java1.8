package com.lz.pojo;

import lombok.Data;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/10 18:26
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class User {
    private int id;
    private String  name;
    private String _class;

    public User(String name, String _class) {
        this.name = name;
        this._class = _class;
    }

    public User(int id, String name, String _class) {
        this.id = id;
        this.name = name;
        this._class = _class;
    }

    public User() {
    }
}
