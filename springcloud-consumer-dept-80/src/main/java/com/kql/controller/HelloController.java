package com.kql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/GetHello/FromProvide")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX = "http://localhost:8001";
    @GetMapping("/hello")
    public String getHello(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/Hello/hello",String.class);
    }
}
