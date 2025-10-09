package com.demo.consumer.httpInterfaces;

import io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.security.Provider;

@Configuration
public class HttpInterfaceConfig {
    @LoadBalanced
    @Bean
    public WebClient.Builder wenClientBUILDER() {
        return WebClient.builder();
    }

    @Bean
    public ProviderHttpInterface webClientHttpInterface(WebClient.Builder webClientBuilder) {
        WebClient webClient = webClientBuilder.baseUrl("http://provider").build();
        WebClientAdapter webAdapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory proxyFactory = HttpServiceProxyFactory.builderFor(webAdapter).build();
        ProviderHttpInterface service = proxyFactory.createClient(ProviderHttpInterface.class);
        return service;
    }


}
