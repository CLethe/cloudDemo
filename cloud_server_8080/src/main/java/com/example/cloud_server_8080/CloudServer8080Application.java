package com.example.cloud_server_8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudServer8080Application.class, args);
    }

}
