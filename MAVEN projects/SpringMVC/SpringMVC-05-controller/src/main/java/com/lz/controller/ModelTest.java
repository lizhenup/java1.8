package com.lz.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/7 21:19
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class ModelTest {
    @RequestMapping("/m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "test";
    }
}
