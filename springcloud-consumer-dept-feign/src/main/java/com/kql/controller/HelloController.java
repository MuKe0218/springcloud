package com.kql.controller;

import com.kql.DepClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/GetHello/FromProvide")
public class HelloController {

//    @Autowired
//    private RestTemplate restTemplate;
//    //通过ribbon地址不能定死，需通过服务名来访问
//    //private static final String REST_URL_PREFIX = "http://localhost:8001";
//    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";
//    @GetMapping("/hello")
//    public String getHello(){
//        return restTemplate.getForObject(REST_URL_PREFIX+"/Test/hello",String.class);
//    }
    @Autowired
    private DepClientService depClientService;

    @GetMapping("/hello")
    public String getHello(){
        return this.depClientService.getHelloWorld();
    }
}
