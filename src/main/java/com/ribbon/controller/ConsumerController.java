package com.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zyt on 2017/8/3.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    //@RequestMapping(value = "/add", method = RequestMethod.GET)
    @GetMapping(value = "/add")
    public String add(){
        String url = "http://COMPUTE-SERVICE/add?a=22&b=100";
        return restTemplate.getForEntity(url, String.class).getBody();
    }
}
