package com.demo.consumer.webClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProviderWebClient {
    @Autowired
    private final WebClientConfig webClient;

    public ProviderWebClient(WebClientConfig webClient) {
        this.webClient = webClient;
    }

    public Mono<String> getInstanceInfo() {
        Mono<String> response = webClient.get()
                .uri("http://provider")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return response;
    }


}
