package com.champaranguesthouse.champaranguesthouseapi.services;



import com.champaranguesthouse.champaranguesthouseapi.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();
}