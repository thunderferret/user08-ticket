package com.example.rumybook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@EnableBinding(com.example.rumybook.config.kafka.KafkaProcessor.class)
@EnableFeignClients
public class RumybookApplication {
    protected static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(RumybookApplication.class, args);
    }

}
