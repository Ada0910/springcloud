package com.ada.eurekaconsumer.controller;

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
public class ConsumerController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        /**eureka-client服务实例的基本信息是存储在ServiceInstancez中*/
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/client";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);

    }

}
