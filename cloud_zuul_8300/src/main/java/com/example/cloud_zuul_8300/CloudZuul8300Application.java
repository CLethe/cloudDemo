package com.example.cloud_zuul_8300;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class CloudZuul8300Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZuul8300Application.class, args);
    }

}
