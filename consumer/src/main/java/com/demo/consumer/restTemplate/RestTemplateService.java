package com.demo.consumer.restTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateService {
    private final RestTemplate restTemplate;
    private static final String PROVIDER_URL = "http://provider";

    public String getInstance() {
        return restTemplate.getForObject(PROVIDER_URL + "/api/instance-info", String.class);
    }


}

