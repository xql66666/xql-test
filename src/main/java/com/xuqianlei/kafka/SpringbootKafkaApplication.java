package com.xuqianlei.kafka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * SpringbootKafkaApplication class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
@SpringBootApplication
public class SpringbootKafkaApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootKafkaApplication.class,args);
        AnnoProducer kafkaMyProducer = context.getBean(AnnoProducer.class);
        for (int i = 0; i < 10; i++) {
            kafkaMyProducer.send();
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
