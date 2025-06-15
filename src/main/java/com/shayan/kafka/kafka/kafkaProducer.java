package com.shayan.kafka.kafka;

import com.shayan.kafka.entity.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class kafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(kafkaProducer.class);
    private static final AtomicLong counter = new AtomicLong(1);

    private KafkaTemplate<String,Message> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Notification data) {
//        if (data.getId() == null) {
//            data.setId(counter.getAndIncrement());
//        }
        Message<Notification> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "Shayan")
                .build();

        LOGGER.info(String.format("Message Sent --> %s", data.toString()));
        kafkaTemplate.send(message);
    }
}
