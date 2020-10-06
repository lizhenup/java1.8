package com.lz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/6 18:29
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping("/tt")
public class ControllerTest3 {
    @RequestMapping("/t2")
    public String test(Model model) {
        model.addAttribute("msg", "ControllerTest3");
        return "test";
    }
}
