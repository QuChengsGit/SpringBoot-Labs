package cn.iocoder.springboot.lab03.kafkademo.producer;

import cn.iocoder.springboot.lab03.kafkademo.Application;
import cn.iocoder.springboot.lab03.kafkademo.fortress.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class FortressTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Producer producer;

    @Test
    public void testSyncSend() throws JsonProcessingException, InterruptedException {
        producer.sendSessionLog();
        new CountDownLatch(1).await();
    }

    @Test
    public void testSyncCharSend() throws JsonProcessingException, InterruptedException {
        producer.sendCharLog();
        new CountDownLatch(1).await();
    }

    @Test
    public void testSyncFileSend() throws JsonProcessingException, InterruptedException {
        producer.sendFileLog();
        new CountDownLatch(1).await();
    }
}
