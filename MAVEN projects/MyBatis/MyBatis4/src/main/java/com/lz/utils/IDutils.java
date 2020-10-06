package com.lz.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/26 16:29
 * @description：
 * @modified By：
 * @version: $
 */
@SuppressWarnings("all")//抑制警告
public class IDutils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test() {
        System.out.println(IDutils.getId());
    }
}
