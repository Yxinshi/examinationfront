package com.bgs.examinationfront;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.bgs.examinationfront.mapper")
public class ExaminationfrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExaminationfrontApplication.class, args);
    }

}
