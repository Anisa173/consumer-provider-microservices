package com.demo.consumer.openFeign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/feign")
@RestController
public class ProviderFeignController {
    private final ProviderFeignService providerFeignService;

    @GetMapping("/instance")
    public String getInstance(){
        return providerFeignService.getInstanceInfo();
    }

}
