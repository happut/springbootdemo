package com.github.happut.springbootdemoeurekaclient.web;


import com.netflix.discovery.DiscoveryClient;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Registration registration;       // 服务注册
    @Autowired
    private DiscoveryClient discoveryClient; // 服务发现客户端

    @RequestMapping("/hello")
    public String index() {
        ServiceInstance instance = serviceInstance();
        logger.info("/hello, host:{},{}", instance.getHost(), instance.getServiceId());
        return "hello world";
    }

    /**
     * 获取当前服务的服务实例
     *
     * @return ServiceInstance
     */
    public ServiceInstance serviceInstance() {
        List<ServiceInstance> list = discoveryClient.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
