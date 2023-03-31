package com.kql;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author keQiLong
 * @date 2023年03月31日 20:32
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")//从哪个服务
@Component
public interface DepClientService {
    @GetMapping("/Test/hello")
    public String getHelloWorld();
}
