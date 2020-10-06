package com.lz.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/31 21:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Log implements MethodBeforeAdvice{
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" +method.getName()+ "被执行了");
    }
}
