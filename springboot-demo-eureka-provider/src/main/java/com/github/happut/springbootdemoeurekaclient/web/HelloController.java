package com.github.happut.springbootdemoeurekaclient.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private DiscoveryClient discoveryClient; // 服务发现客户端

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String index() {
        return restTemplate.getForObject("", String.class);
    }
}
