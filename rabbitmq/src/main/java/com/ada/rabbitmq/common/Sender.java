package com.ada.rabbitmq.common;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Ada
 * @ClassName :Sender
 * @date 2019/9/17 23:05
 * @Description:
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String msg = "hello : RabbitMQ:" + new Date();
        System.out.println("Sender:" + msg);
        this.amqpTemplate.convertAndSend("hello", msg);
    }
}
