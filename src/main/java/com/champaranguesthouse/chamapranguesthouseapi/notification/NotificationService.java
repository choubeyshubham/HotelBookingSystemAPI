package com.champaranguesthouse.chamapranguesthouseapi.notification;

import com.champaranguesthouse.chamapranguesthouseapi.dtos.NotificationDTO;
import com.champaranguesthouse.chamapranguesthouseapi.entities.Notification;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();





}
