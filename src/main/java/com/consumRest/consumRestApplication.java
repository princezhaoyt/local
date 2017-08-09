package com.consumRest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zyt on 2017/8/7.
 */
public class consumRestApplication {
    private static final Logger logger = LoggerFactory.getLogger(consumRestApplication.class);

    public static void main(String[] args){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        logger.info(quote.toString());
    }
}
