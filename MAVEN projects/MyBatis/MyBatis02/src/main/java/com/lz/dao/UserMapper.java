package com.lz.dao;

import com.lz.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    List<User> getUserLike(String s);

    //根据ID查询用户
    User getUserById(int id);


    User getUserById2(Map<String, Object> map);

    int addUser(User user);

    int addUser2(Map<String, Object> map);

    int upDateUser(User user);

    int deleteUser(int id);
}