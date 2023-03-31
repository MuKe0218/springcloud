package com.kql.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //配置负载均衡实现RestTemplate
    /*IRule 设置负载均衡配置
    AvailabilityFilteringRule 会过滤掉崩溃的服务，跳闸，访问故障服务，对剩下的进行轮询
    RoundRobinRule 轮询 默认的算法
    RandomRule 随机
    RetryRule 会先按照轮询获取服务，如果服务获取失败，则会在自定的时间内进行重试
    */
    @Bean
    @LoadBalanced //ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
