package com.lz.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/30 22:50
 * @description：
 * @modified By：
 * @version: $
 */
@Component
//等价于<bean id="user" class="com.lz.pojo.User"/>
public class User {
    @Value("忘了爱1")
    //等价于<property name="name" value="忘了爱1"/>
    public String name;
}
