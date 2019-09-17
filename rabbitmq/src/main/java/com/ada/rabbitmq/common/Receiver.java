package com.ada.rabbitmq.common;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Ada
 * @ClassName :Receiver
 * @date 2019/9/17 23:10
 * @Description:
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Recevier:" + msg);
    }

}
