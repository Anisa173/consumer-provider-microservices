package com.demo.consumer.restClient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RestClientService {
    public final RestClientConfig restClient;

    public String InstanceInfo() {
        return restClient.get()
                .uri("http://provider")
                .retrieve()
                .body(String.class);
    }


}
