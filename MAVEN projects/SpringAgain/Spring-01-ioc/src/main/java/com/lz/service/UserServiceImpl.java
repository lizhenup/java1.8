package com.lz.service;

import com.lz.dao.UserDao;
import com.lz.dao.UserDaoImpl;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/29 23:32
 * @description：
 * @modified By：
 * @version: $
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public  void getUser() {
        userDao.getUser();
    }

}
