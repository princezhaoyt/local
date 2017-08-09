package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.File;
import java.io.IOException;

/**
 * Created by zyt on 2017/6/12.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputerServiceApplication {
    public static void main(String[] args){
        //new SpringApplicationBuilder(ComputerServiceApplication.class).web(true).run(args);
        SpringApplication.run(ComputerServiceApplication.class, args);
    }
}

