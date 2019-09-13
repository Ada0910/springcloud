package com.ada.eurekaconsumehystrix.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ada
 * @ClassName :ConsumerService
 * @date 2019/9/10 23:04
 * @Description:
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {

        return restTemplate.getForObject("http://eureka-client/client", String.class);
    }

    public String fallback() {

        return "fallback";
    }
}
