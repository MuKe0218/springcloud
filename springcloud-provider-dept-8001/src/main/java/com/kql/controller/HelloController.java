package com.kql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Test")
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello world";
    }

    @Autowired
    private DiscoveryClient client;
    @GetMapping("/getInfo")
    //注册进来的微服务，获取一些信息
    public Object discover(){
        //获取服务列表清单
        List<String> service = client.getServices();
        System.out.println("discover=>service"+service);
        //得到一个具体的微服务,获取奇信息
        List<ServiceInstance> instances = client.getInstances("");
        for (ServiceInstance instance:instances){
            System.out.println(instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId());
        }
        return this.client;
    }
}
