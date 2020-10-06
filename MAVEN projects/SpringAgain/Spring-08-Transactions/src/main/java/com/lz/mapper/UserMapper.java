package com.lz.mapper;

import com.lz.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    int addUser(User user);
    int deleteUser(int id);
    int upDateUser(int id);
}
