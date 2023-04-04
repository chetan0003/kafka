package com.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class KafkaProducer {

    private static final String MY_TOPIC = "my-topic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sensMessage(String message){
        kafkaTemplate.send(MY_TOPIC,message);
    }

}
