package com.kql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //服务端的启动类，可以
public class EurekaService_7003 {
    public static void main(String[] args){
        SpringApplication.run(EurekaService_7003.class,args);
    }
}
