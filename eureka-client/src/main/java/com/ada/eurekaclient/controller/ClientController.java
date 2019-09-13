package com.ada.eurekaclient.controller;

/**
 * @author Ada
 * @ClassName :ClientController
 * @date 2019/9/5 23:02
 * @Description:
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/client")
    public String client() throws InterruptedException {
        Thread.sleep(5000L);
        String services = "Services:" + discoveryClient.getServices();
        System.out.println("services");
        return services;
    }
}
