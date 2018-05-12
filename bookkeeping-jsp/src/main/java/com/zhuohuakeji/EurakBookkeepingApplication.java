package com.zhuohuakeji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients//加入feign模块
@EnableDiscoveryClient(autoRegister = false)//服务注解表示当前项目是一个发现服务  autoRegister=false 表示本模块不会注册到Eureka中
@EnableCircuitBreaker//hstrix注解y
public class EurakBookkeepingApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(EurakBookkeepingApplication.class,args);
    }
}
