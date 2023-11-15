package com.dcm.kafka;/*
package kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.ericsson.cv.service.DataConsumerHandle;

import java.util.List;
@Service
public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);
    @Autowired
    private DataConsumerHandle dataConsumerHandle;
    @KafkaListener(topics = "dcm-topic")
    */
/*@KafkaListener(topicPattern = "${kafka.topics}")*//*

    public void listen(List<ConsumerRecord<?, ?>> msgList) {
        logger.warn("Consumer message Receiver ...");
        logger.info("Consumer message Receiver ...", msgList);
        System.out.println("Hello dcm Reciever"+ msgList);
        for (ConsumerRecord<?, ?> consumerRecord : msgList) {
            String inbound = consumerRecord.value().toString();
            String topic = consumerRecord.topic();
            dataConsumerHandle.process(inbound, consumerRecord.topic());
        }
        logger.debug("Consumer message Receiver end...");
    }
}*/
