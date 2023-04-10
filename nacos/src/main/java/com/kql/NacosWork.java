package com.kql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author keQiLong
 * @date 2023年04月10日 8:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosWork {
    public static void main(String[] args) {
        SpringApplication.run(NacosWork.class,args);
    }
}
