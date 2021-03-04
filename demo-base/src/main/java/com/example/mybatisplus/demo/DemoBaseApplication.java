package com.example.mybatisplus.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisplus.demo.mapper")
public class DemoBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoBaseApplication.class, args);
    }
}
