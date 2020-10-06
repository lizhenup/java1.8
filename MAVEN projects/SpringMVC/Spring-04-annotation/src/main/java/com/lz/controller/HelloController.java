package com.lz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashSet;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/6 17:30
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(Model model) {
        model.addAttribute("msg","Hello, Spring MVC Annotation");
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        set.add('1');
        set.toArray();

        return "hello";//会被视图解析器解析


    }
}
