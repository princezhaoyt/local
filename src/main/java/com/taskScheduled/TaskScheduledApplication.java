package com.taskScheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zyt on 2017/8/7.
 */
@SpringBootApplication
@EnableScheduling
public class TaskScheduledApplication {

    public static void main(String[] args){
        SpringApplication.run(TaskScheduledApplication.class, args);
    }
}
