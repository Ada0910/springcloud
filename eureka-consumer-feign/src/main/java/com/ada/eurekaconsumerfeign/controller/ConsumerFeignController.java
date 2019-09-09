package com.ada.eurekaconsumerfeign.controller;

import com.ada.eurekaconsumerfeign.service.ConsumerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:ConsumerController
 * @author: Ada
 * @date 2019/09/06 17:13
 * @Description:
 */
@RestController
public class ConsumerFeignController {

    @Autowired
    ConsumerFeignClient consumerFeignClient;

    @GetMapping("/consumer")
    public String feign() {
        return consumerFeignClient.consumer();
    }
}
