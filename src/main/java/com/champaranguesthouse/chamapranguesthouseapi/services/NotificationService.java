package com.champaranguesthouse.chamapranguesthouseapi.services;

import com.champaranguesthouse.chamapranguesthouseapi.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();
}
