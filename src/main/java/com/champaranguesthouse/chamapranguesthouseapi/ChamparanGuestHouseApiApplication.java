package com.champaranguesthouse.chamapranguesthouseapi;

import com.champaranguesthouse.chamapranguesthouseapi.dtos.NotificationDTO;
import com.champaranguesthouse.chamapranguesthouseapi.entities.Notification;
import com.champaranguesthouse.chamapranguesthouseapi.notification.NotificationService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ChamparanGuestHouseApiApplication {
//
//    private final NotificationService notificationService;
//
//    public ChamparanGuestHouseApiApplication(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ChamparanGuestHouseApiApplication.class, args);
    }

//
//    @PostConstruct
//    public void sendDummyEmail() {
//        NotificationDTO notificationDTO =NotificationDTO.builder()
//                .recipient("hijackworld@gmail.com")
//                .subject("Hello Testing")
//                .body("Hello Bro, I am running an email service test")
//                .build();
//        notificationService.sendEmail(notificationDTO);
//    }
}
