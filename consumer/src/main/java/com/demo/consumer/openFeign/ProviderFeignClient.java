package com.demo.consumer.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="provider-service")
public interface ProviderFeignClient {
@GetMapping("/api/instance-info")
public String getInstanceInfo();

}
