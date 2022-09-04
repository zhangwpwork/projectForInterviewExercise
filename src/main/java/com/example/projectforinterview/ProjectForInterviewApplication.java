package com.example.projectforinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class ProjectForInterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectForInterviewApplication.class, args);
    }

}
