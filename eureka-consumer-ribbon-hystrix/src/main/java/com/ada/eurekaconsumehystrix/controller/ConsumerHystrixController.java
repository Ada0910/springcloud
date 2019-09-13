package com.ada.eurekaconsumehystrix.controller;

import com.ada.eurekaconsumehystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ConsumerHystrixController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String consumer() {

        return consumerService.consumer();
    }



}
