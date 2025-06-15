package com.shayan.kafka.kafka;

import com.shayan.kafka.entity.Notification;
import com.shayan.kafka.service.MessageStoringService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(kafkaProducer.class);

    @Autowired
    private MessageStoringService messageStoringService;

    @KafkaListener(topics = "Shayan",groupId = "myGroup")
    public void consumeMessage(Notification data)
    {
        LOGGER.info(String.format("Message Recieved: %s ",data.toString()));
        messageStoringService.addMessages(data);
    }
}
