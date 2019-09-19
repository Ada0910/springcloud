package com.ada.streamhello;

import com.ada.streamhello.service.MySource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/*@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = StreamHelloApplication.class)
@EnableBinding(MySource.class)
public class StreamHelloApplicationTests {
    @Autowired
    private MySource mySource;
    @Test
    public void contextLoads() {
        mySource.output().send(MessageBuilder.withPayload("hello 123").build());
    }

}*/
