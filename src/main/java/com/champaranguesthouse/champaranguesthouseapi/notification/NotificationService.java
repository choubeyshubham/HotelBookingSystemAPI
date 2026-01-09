package com.champaranguesthouse.champaranguesthouseapi.notification;

import com.champaranguesthouse.champaranguesthouseapi.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();





}
