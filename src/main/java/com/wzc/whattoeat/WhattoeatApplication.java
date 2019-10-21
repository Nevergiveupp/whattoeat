package com.wzc.whattoeat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wzc.whattoeat.dao")
@SpringBootApplication
public class WhattoeatApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhattoeatApplication.class, args);
    }

}
