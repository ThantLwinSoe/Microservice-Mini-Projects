package com.example.affablebeanui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AffableBeanUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AffableBeanUiApplication.class, args);
    }

}
