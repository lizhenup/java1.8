package com.lz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author ：lizhen
 * @date ：Created in 2020/10/4 16:55
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class TestController {
    @GetMapping("/t1")
    public String test() {
        System.out.println("somethings");
        return "OK";
    }
}
