package com.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaReciever {

    @KafkaListener(topics = "my-topic", groupId = "my-group-id")
    public void listen(String message) {
        log.info("Received message: " + message);
    }

}
