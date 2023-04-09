package com.example.uniproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.uniproject.*"})
@MapperScan("com.example.uniproject.mapper")
public class UniProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniProjectApplication.class, args);
    }

}
