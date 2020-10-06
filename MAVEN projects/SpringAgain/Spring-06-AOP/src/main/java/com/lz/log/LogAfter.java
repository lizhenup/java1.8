package com.lz.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/31 21:23
 * @description：
 * @modified By：
 * @version: $
 */
public class LogAfter implements AfterReturningAdvice {
    public void afterReturning(Object returnVal, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + o1.getClass().getName() + "方法，返回结果为:" + returnVal);
    }
}
