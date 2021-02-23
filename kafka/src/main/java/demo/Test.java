package demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * test class
 *
 * @author qianlei.xu
 * @date 2021/2/23
 */
public class Test {

    @org.junit.Test
    public void kafkaProducer() throws Exception {
        //1、准备配置文件
        Properties props = new Properties();
        props.put("bootstrap.servers", "1.15.39.60:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        //props.put("partitioner.class", "cn.itcast.kafka.partitioner.KafkaCustomPartitioner");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        //2、创建KafkaProducer
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(props);
        for (int i=0;i<100;i++){
            //3、发送数据
            kafkaProducer.send(new ProducerRecord<String, String>("test", "value" + i));
        }

        kafkaProducer.close();
    }
}
