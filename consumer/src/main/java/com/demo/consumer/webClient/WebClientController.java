package com.demo.consumer.webClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RequestMapping
@RestController
public class WebClientController {
    @Autowired
    private final ProviderWebClient pWebClient;

    public WebClientController(ProviderWebClient pWebClient) {
        this.pWebClient = pWebClient;
    }

    @GetMapping
    public Mono<String> getInstanceInfo() {
        return pWebClient.getInstanceInfo();
    }


}
