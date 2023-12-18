package cn.iocoder.springboot.lab03.kafkademo.fortress;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import javax.annotation.Resource;

/**
 * @author ：qucheng
 * @version : 1.0
 * @description ：TODO
 * @date ：2023/12/7 15:11
 */
@Slf4j
@Component
public class Producer {
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendSessionLog() throws JsonProcessingException {
        SessionPO sessionPO = BuildSessionLog.buildSessionLog();
        String result = new Gson().toJson(sessionPO);
        System.out.println(result);
        sendLogToKafka("ct2-fortress-session",result,"会话");
    }
    public void sendCharLog() throws JsonProcessingException {
        CharEventPO charEventPO = BuildSessionLog.buildCharEventPO();

        String result = new Gson().toJson(charEventPO);
        sendLogToKafka("ct2-fortress-char",result,"命令");
    }
    public void sendFileLog() throws JsonProcessingException {
        FileEventPO fileEventPO = BuildSessionLog.buildFileEventPO();
        String result = new Gson().toJson(fileEventPO);
        sendLogToKafka("ct2-fortress-file",result,"文件");
    }

    public void sendLogToKafka(String topic, String message, String type) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, message);
        log.info(type + "推送日志 {}", message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("Kafka推送" + type + "日志成功！offset: {}", result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                log.error("Kafka推送" + type + "日志异常，信息：", ex);
            }
        });
    }
}
