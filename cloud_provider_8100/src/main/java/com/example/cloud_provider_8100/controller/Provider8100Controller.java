package com.example.cloud_provider_8100.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider8100Controller {
    @RequestMapping("/hello")
    public String t1(){
        return "hh";
    }
}
