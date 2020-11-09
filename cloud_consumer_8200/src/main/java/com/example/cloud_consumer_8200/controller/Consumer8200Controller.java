package com.example.cloud_consumer_8200.controller;

import com.example.cloud_consumer_8200.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer8200Controller {
//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//    @Qualifier("restTemplate")
//    @Autowired
//    private RestTemplate restTemplate;
//    @RequestMapping("/hello")
//    public String t1(){
//        return restTemplate.getForEntity("http://cloud-provider/hello",String.class).getBody();
//    }

    @Qualifier("cloud-provider")
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String t1(){
        return userService.t1();
    }
}
