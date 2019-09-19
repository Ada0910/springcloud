package com.ada.streamhello.common;

import com.ada.streamhello.StreamHelloApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ada
 * @ClassName :SinkReceiver
 * @date 2019/9/19 22:58
 * @Description: 使用了@EnableBinding注解实现对消息通道的绑定，
 * 我们在该注解中还传入了一个参数Sink.class，Sink是一个接口，
 * 该接口是Spring Cloud Stream中默认实现的对输入消息通道绑定的定义。
 * 然后我们在SinkReceiver类中定义了receive方法，
 * 并在该方法上添加了@StreamListener注解，
 * 该注解表示该方法为消息中间件上数据流的事件监听器，
 * Sink.INPUT参数表示这是input消息通道上的监听处理器。
 */
/*@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object playload) {
        logger.info("Received:" + playload);
    }
}*/
