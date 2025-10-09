package com.demo.consumer.httpInterfaces;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ProviderHttpInterface {
    @GetExchange("/api/instance-info")
    public String getInstanceInfo();

}
