package com.lz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/7 20:51
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class RestFulController {
    //http://localhost:8089/add?a=1&b=3 原

    //@RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    //精简为以下
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为"+res);
        return "test";
    }
}
