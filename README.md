# Kafka Notifications 📬

This is a Spring Boot-based project that demonstrates real-time message processing using **Apache Kafka**, with persistence in **PostgreSQL**. All services are containerized using **Docker Compose**, and database management is supported through **pgAdmin4**.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3+**
- **Apache Kafka** (KRaft mode)
- **PostgreSQL**
- **pgAdmin 4**
- **Docker Compose**

---

## 📦 Features

- Kafka producer/consumer integration
- Kafka messages stored in a PostgreSQL table (`notification`)
- REST API for consuming and retrieving notifications (optional)
- Dockerized PostgreSQL, Kafka (Bitnami), and pgAdmin
- Uses JPA/Hibernate to auto-create tables

---
