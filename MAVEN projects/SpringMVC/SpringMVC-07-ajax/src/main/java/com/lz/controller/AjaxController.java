package com.lz.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lizhen
 * @date ：Created in 2020/10/4 15:26
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpResponse response) {
        System.out.println(name);
        if("lz".equals(name)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
