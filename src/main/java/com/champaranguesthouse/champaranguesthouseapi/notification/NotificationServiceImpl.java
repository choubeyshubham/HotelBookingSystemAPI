package com.champaranguesthouse.champaranguesthouseapi.notification;

import com.champaranguesthouse.champaranguesthouseapi.dtos.NotificationDTO;
import com.champaranguesthouse.champaranguesthouseapi.entities.Notification;
import com.champaranguesthouse.champaranguesthouseapi.enums.NotificationType;
import com.champaranguesthouse.champaranguesthouseapi.repositories.BookingReferenceRepository;
import com.champaranguesthouse.champaranguesthouseapi.repositories.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {


    private final JavaMailSender javaMailSender;
    private final NotificationRepository notificationRepository;
    private final BookingReferenceRepository bookingReferenceRepository;

    @Override
    @Async
    public void sendEmail(NotificationDTO notificationDTO) {
        log.info("Sending mail ...");
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(notificationDTO.getRecipient());
        mailMessage.setSubject(notificationDTO.getSubject());
        mailMessage.setText(notificationDTO.getBody());

        javaMailSender.send(mailMessage);
        //ending email
        Notification notificationToSave= Notification.builder()
                .recipient(notificationDTO.getRecipient())
                .subject(notificationDTO.getSubject())
                .body(notificationDTO.getBody())
                .bookingReference(notificationDTO.getBookingReference())
                .type(NotificationType.EMAIL)
                .build();

        notificationRepository.save(notificationToSave);


    }

    @Override
    public void sendSms() {

    }

    @Override
    public void sendWhatsapp() {

    }
}
