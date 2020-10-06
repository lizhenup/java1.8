package com.lz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/6 18:21
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model) {
      model.addAttribute("msg", "ControllerTest2");
      return "test";
    }
}
