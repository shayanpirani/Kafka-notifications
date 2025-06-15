package com.shayan.kafka.service;

import com.shayan.kafka.entity.Notification;
import com.shayan.kafka.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class MessageStoringService {
    List<Notification> messages = new CopyOnWriteArrayList<>();

    @Autowired
    private MessageRepository messageRepository;

    public void addMessages(Notification data)
    {
        messages.add(data);
        messageRepository.saveAndFlush(data);
    }

    public List<Notification> getMessages()
    {
        return messages;
    }
}
