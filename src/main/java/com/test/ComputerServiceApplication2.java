package com.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zyt on 2017/6/12.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputerServiceApplication2 {
    public static void main(String[] args){
        new SpringApplicationBuilder(ComputerServiceApplication2.class).web(true).run(args);
    }
}
