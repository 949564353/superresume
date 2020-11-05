package com.hongang.superresume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hongang.superresume.dao")
public class SuperresumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperresumeApplication.class, args);
    }

}
