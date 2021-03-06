package com.hwadee.scu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hwadee.scu.mapper")
public class ScuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScuApplication.class, args);
    }

}
