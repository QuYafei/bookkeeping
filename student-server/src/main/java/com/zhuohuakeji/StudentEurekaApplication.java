package com.zhuohuakeji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@MapperScan("com.zhuohuakeji.dao")
@EnableEurekaServer
public class StudentEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentEurekaApplication.class,args);
    }
}
