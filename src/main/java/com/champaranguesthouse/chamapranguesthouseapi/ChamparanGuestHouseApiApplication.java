package com.champaranguesthouse.chamapranguesthouseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ChamparanGuestHouseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChamparanGuestHouseApiApplication.class, args);
    }

}
