package com.lz.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/26 16:15
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class Blog {
    private String  id;
    private String title;
    private String author;
    private Date createTime; //属性名和字段名不一样
    private int views;

}
