package com.champaranguesthouse.chamapranguesthouseapi.notification;

import com.champaranguesthouse.chamapranguesthouseapi.dtos.NotificationDTO;
import com.champaranguesthouse.chamapranguesthouseapi.entities.Notification;
import com.champaranguesthouse.chamapranguesthouseapi.enums.NotificationType;
import com.champaranguesthouse.chamapranguesthouseapi.repositories.BookingReferenceRepository;
import com.champaranguesthouse.chamapranguesthouseapi.repositories.NotificationRepository;
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
