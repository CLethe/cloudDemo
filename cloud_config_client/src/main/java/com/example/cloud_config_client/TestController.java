package com.example.cloud_config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${spring.application.name}")
    private String name;
    @RequestMapping("/hah")
    public String t1(){
        return name;
    }
}
