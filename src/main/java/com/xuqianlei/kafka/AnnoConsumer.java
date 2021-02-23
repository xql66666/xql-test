package com.xuqianlei.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * AnnoConsumer class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
@Component
public class AnnoConsumer {

    @KafkaListener(topics = {"test"})
    public void listener(ConsumerRecord record) {
        Optional<Object> msg = Optional.ofNullable(record.value());
        if (msg.isPresent()) {
            System.out.println(msg.get());
        }
    }
}
