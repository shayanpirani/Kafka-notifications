package com.shayan.kafka.entity;

import java.util.concurrent.atomic.AtomicLong;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    public Notification() {
    }

    public Notification(String message) {
        this.message = message;
    }
}
