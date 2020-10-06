package com.lz.spring20201005.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author ：lizhen
 * @date ：Created in 2020/10/5 21:04
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class TaskUtils {
    @Scheduled(cron = "0/3 * * * * ?" )
    public void doTask() {
        System.out.println("我是定时任务");
    }
}
