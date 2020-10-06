package com.lz.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/6 11:16
 * @description：
 * @modified By：
 * @version: $
 */
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        //调用业务层

        //封装对象，放在ModelAndView中。Model
        mv.addObject("msg","HelloSpringMVC!");


        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("hello");//: /WEB-INF/jsp/hello.jsp
         return mv;
    }
}
