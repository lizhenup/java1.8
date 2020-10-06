package com.lz.spring20201005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching //开启缓存
@EnableScheduling //开启定时任务
public class Spring20201005Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring20201005Application.class, args);
        System.out.println("Hello SpringBoot");
    }

}
