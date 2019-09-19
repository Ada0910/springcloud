package com.ada.streamhello.service;

/**
 * @author Ada
 * @ClassName :MySource
 * @date 2019/9/19 23:21
 * @Description:
 */
public interface MySource {
    /**
     * @Output注解中描述了消息通道的名称，还是mychannel，
     * 然后这里我们也定义了一个返回MessageChannel对象的方法，该对象中有一个向消息通道发送消息的方法
     */
   /* @Output(MySink.INPUT)
    MessageChannel output();*/
}
