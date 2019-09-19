package com.ada.streamhello.service;

/**
 * @author Ada
 * @ClassName :MySink
 * @date 2019/9/19 23:18
 * @Description:
 */
public interface MySink {
    String INPUT = "myChannel";

    /***@Input注解的参数则表示了消息通道的名称，
     * 同时我们还定义了一个方法返回一个SubscribableChannel对象，该对象用来维护消息通道订阅者*/
   /* @input(INPUT)
    SubscribableChannel input();*/
}
