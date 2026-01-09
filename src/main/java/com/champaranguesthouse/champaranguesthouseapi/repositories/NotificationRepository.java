package com.champaranguesthouse.champaranguesthouseapi.repositories;


import com.champaranguesthouse.champaranguesthouseapi.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}