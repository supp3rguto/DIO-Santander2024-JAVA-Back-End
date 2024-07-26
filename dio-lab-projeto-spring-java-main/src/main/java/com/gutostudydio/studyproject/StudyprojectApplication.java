package com.gutostudydio.studyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class StudyprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyprojectApplication.class, args);
    }
}
