package com.lz.controller;

import com.lz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/7 23:20
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test(@RequestParam("username") String name, Model model) {
        System.out.println("接收到的参数为："+ name);
        model.addAttribute("msg", name);
        return "test";

    }
    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }



}

