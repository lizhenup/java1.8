package com.lz.mapper;

import com.lz.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/1 13:08
 * @description：
 * @modified By：
 * @version: $
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    public List<User> selectUser() {
        User user = new User("4号","666");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(2);
        return mapper.selectUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    public int upDateUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).upDateUser(id);
    }
}
