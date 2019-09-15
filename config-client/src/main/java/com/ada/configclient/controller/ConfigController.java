package com.ada.configclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ada
 * @ClassName :ConfigController
 * @date 2019/9/15 16:39
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${Ada}")
    public String name;
    @Autowired
    Environment dev;

    @RequestMapping("/getName")
    public String getName() {
        return this.name;
    }

    @RequestMapping("/getError")
    public String getError() {
        return dev.getProperty("ada", "未定义");
    }
}
