package com.example.alarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AlarmApplication {
    protected static ApplicationContext applicationContext;
    public static void main(String[] args) {
        SpringApplication.run(AlarmApplication.class, args);
    }

}
