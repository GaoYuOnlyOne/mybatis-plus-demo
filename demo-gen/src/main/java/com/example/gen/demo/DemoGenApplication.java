package com.example.gen.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.gen.demo.mapper")
public class DemoGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGenApplication.class, args);
    }

}
