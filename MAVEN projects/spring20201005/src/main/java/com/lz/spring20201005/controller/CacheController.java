package com.lz.spring20201005.controller;

import com.lz.spring20201005.pojo.Person;
import com.lz.spring20201005.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lizhen
 * @date ：Created in 2020/10/5 20:30
 * @description：
 * @modified By：
 * @version: $
 */

@RequestMapping("/cache")
@RestController
public class CacheController {
    //表示被修饰的类需要注入对象,spring会扫描所有被@Autowired标注的类,
    // 然后根据 类型 在ioc容器中找到匹配的类注入。
    @Autowired
    CacheService cacheService;

    /**
     * create by: lizhen
     * description:查询方法
     * create time:
     *
     * @return a
     * @Param: null
    */
    @RequestMapping("/get")
    public Person getPerson(int id) {
        return cacheService.getPerson(id);
    }

    //修改
    @RequestMapping("/up")
    public Person upPerson(int id) {
        return cacheService.upPerson(id);
    }
    @RequestMapping("/del")
    public boolean delPerson(int id) {
        cacheService.delPerson(id);
        return true;

    }
}
