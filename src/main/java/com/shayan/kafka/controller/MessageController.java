package com.shayan.kafka.controller;

import com.shayan.kafka.entity.Notification;
import com.shayan.kafka.kafka.kafkaProducer;
import com.shayan.kafka.service.MessageStoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    private kafkaProducer kafkaProducer;

    @Autowired
    private MessageStoringService messageStoringService;

    public MessageController(kafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Notification message)
    {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message Sent Successfully.");
    }

    @GetMapping("/messages")
    public List<Notification> getMessages()
    {
        return messageStoringService.getMessages();
    }
}
