package com.dana.pig.demopractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoPracticeApplication.class, args);
    }

}
