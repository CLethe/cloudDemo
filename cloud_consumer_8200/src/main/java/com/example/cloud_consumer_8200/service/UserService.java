package com.example.cloud_consumer_8200.service;

import com.example.cloud_api.entity.User;
import com.example.cloud_consumer_8200.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-provider", fallback = UserServiceFallback.class)
public interface UserService {
    @RequestMapping("/hello")
    String t1();
}
