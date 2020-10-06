package com.lz.spring20201005.service;

import com.lz.spring20201005.pojo.Person;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author ：lizhen
 * @date ：Created in 2020/10/5 20:21
 * @description：
 * @modified By：
 * @version: $
 */
/*
* 1.添加缓存
* 2.修改缓存
* 3.删除缓存
*
* */
@Component//pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
public class CacheService {

    @Cacheable(cacheNames = "person",key = "#id")
    public Person getPerson(int id) {
        System.out.println("进入了getPerson");
        Person person = new Person(id,"Java",18);
        return person;
    }

    //缓存更新
    @CachePut( cacheNames = "person",key = "#id")
    public Person upPerson(int id) {
        System.out.println("进入了upPerson");
        Person person = new Person(id,"Java",155);
        return person;
    }

    // 缓存删除
    @CacheEvict( cacheNames = "person",key = "#id")
    public void delPerson(int id) {
        System.out.println("delPerson");
    }
}
