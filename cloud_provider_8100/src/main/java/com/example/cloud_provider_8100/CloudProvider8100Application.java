package com.example.cloud_provider_8100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProvider8100Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8100Application.class, args);
    }

}
