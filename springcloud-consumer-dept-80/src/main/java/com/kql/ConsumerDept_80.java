package com.kql;

import com.kql.config.MyRibbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义的ribbon
@RibbonClient(name = "dadsfaf",configuration = MyRibbon.class)
public class ConsumerDept_80 {
    public static void main(String[] args){
        SpringApplication.run(ConsumerDept_80.class,args);
    }
}
