package com.demo.consumer.httpInterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpInterfaceController {

    private final ProviderHttpInterface providerClient;

    public HttpInterfaceController(ProviderHttpInterface providerClient) {
        this.providerClient = providerClient;
    }

    @GetMapping("/instance")
    public String getInstanceInfo() {
        return providerClient.getInstanceInfo();
    }


}
