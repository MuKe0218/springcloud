package com.kql.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author keQiLong
 * @date 2023年03月31日 20:14
 */
@Configuration
public class MyRibbon {
    @Bean
    public IRule myRule(){
        return new RetryRule();
    }
}
