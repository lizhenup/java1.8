package com.lz.sessionFactory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/31 23:55
 * @description：
 * @modified By：
 * @version: $
 */
public class SessionFactory {
    /*static SqlSessionFactory sqlSessionFactory;

    static {
        String str = "MyBatis-config.xml";
        try {
            InputStream stream = Resources.getResourceAsStream(str);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        return sqlSessionFactory.openSession(true);
    }*/
}