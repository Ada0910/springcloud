package com.ada.eurekaconsumeribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:ConsumerController
 * @author: Ada
 * @date 2019/09/0617:13
 * @Description:
 */
@RestController
public class ConsumerRibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {

        return restTemplate.getForObject("http://eureka-client/client", String.class);

    }

}
