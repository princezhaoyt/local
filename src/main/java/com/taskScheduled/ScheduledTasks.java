package com.taskScheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务执行
 * Created by zyt on 2017/8/7.
 */
@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat simpleDataFormat = new SimpleDateFormat("HH:mm:ss");

    //支持cron表达式
    @Scheduled(cron = "*/2 * * * * *")
    //其他间隔
//    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        logger.info("The time now is {}", simpleDataFormat.format(new Date()));
    }
}
