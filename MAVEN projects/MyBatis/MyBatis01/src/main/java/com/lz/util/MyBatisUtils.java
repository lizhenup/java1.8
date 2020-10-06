package com.lz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/10 16:30
 * @description：
 * @modified By：
 * @version: $
 */
public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream  = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //有了SqlSessionFactory，顾名思义，我们可以拿到SqlSession实例
    //SqlSession 完全包含了面向数据库执行的SQL命令所需的所有方法

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
