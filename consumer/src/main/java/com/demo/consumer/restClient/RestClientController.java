package com.demo.consumer.restClient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RestClientController {
    private final RestClientService restClientService;

    @GetMapping
    public String getInstanceInfo() {
        return restClientService.InstanceInfo();
    }


}
