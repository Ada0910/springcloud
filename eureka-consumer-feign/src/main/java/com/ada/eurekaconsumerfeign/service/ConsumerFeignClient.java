package com.ada.eurekaconsumerfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ada
 * @ClassName :ConsumerFeignClient
 * @date 2019/9/8 15:55
 * @Description:
 */
@FeignClient("eureka-client")
public interface ConsumerFeignClient {

    @GetMapping("/client")
    String consumer();

}
