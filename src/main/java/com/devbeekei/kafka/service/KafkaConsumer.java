package com.devbeekei.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "fruit", groupId = "devbeekei")
    public void consume(String message) throws IOException {
        System.out.println(String.format("Consumed message : %s", message));
    }

}