package com.demo.consumer.restTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rest-template")
public class RestInstanceController {
    private final RestTemplateService restTemplateClient;

    @GetMapping("/instance")
    public String getInstance() {
        return restTemplateClient.getInstance();
    }


}
