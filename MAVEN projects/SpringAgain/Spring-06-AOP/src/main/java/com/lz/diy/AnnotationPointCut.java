package com.lz.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/31 22:52
 * @description：
 * @modified By：
 * @version: $
 */
@Aspect//标注该类为切面
class AnnotationPointCut {
    @Before("execution(* com.lz.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("beforeAnn");
    }

    @After("execution(* com.lz.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("afterAnn");
    }

    @Around("execution(* com.lz.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("afterAro");
        System.out.println("我干的"+ point.proceed());
        System.out.println("afterAro");
    }
}
