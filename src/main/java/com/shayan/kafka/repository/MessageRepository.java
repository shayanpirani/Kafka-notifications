package com.shayan.kafka.repository;

import com.shayan.kafka.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Notification, Long> {
}
