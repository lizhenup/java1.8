package com.lz.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author ：lizhen
 * @date ：Created in 2020/9/6 12:50
 * @description：
 * @modified By：
 * @version: $
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码
        String result = "HelloSpringMVC-03";
        mv.addObject("msg",result);

        //视图转移

        mv.setViewName("test");
        return mv;
    }
}
