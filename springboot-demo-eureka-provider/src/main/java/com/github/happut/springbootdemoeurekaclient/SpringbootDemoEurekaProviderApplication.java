package com.github.happut.springbootdemoeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootDemoEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoEurekaProviderApplication.class, args);
    }
}
