package com.github.happut.springbootdemoeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootDemoEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoEurekaClientApplication.class, args);
	}
}
