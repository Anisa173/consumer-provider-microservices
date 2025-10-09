package com.demo.consumer.openFeign;

import org.springframework.stereotype.Service;

@Service
public class ProviderFeignService implements ProviderFeignClient {


    @Override
    public String getInstanceInfo() {
        return "Hello World";
    }
}
