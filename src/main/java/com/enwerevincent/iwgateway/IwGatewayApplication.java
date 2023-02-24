package com.enwerevincent.iwgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IwGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IwGatewayApplication.class, args);
    }

}
