package com.xuqianlei.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * AnnoProducer class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
@Component
public class AnnoProducer {

    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    public void send() {
        kafkaTemplate.send("test", 1, "msgData");
    }
}
