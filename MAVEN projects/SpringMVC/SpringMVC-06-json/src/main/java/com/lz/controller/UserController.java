package com.lz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/11 19:26
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//不会经过视图解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {
        User user = new User("菠萝",6,"男");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValueAsString(user);
        return mapper.writeValueAsString(user);
    }
}
