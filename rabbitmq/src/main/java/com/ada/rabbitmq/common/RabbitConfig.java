package com.ada.rabbitmq.common;



import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author Ada
 * @ClassName :RabbitConfig
 * @date 2019/9/17 23:12
 * @Description:
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {

        return new Queue("hello");
    }

}
