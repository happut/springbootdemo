package com.github.happut.springbootdemoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootDemoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoEurekaServerApplication.class, args);
	}
}
