package com.kafka.controller;

import com.kafka.service.KafkaProducer;
import com.kafka.service.KafkaReciever;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class MessageController {

    private final KafkaProducer kafkaProducer;


    @GetMapping("/publish/{message}")
    public void sendMessage(String message) {
        kafkaProducer.sensMessage(message);
    }


}
