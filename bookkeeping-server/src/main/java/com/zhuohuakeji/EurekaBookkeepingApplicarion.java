package com.zhuohuakeji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaServer//把服务放进Eureka中心中
@EnableCircuitBreaker//支持hystrix模块的注解
@EnableHystrixDashboard//监听监视hystrix模块的注解 需要引入相应的jar包
@MapperScan("com.zhuohuakeji.dao")
public class EurekaBookkeepingApplicarion {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBookkeepingApplicarion.class,args);
    }
}
