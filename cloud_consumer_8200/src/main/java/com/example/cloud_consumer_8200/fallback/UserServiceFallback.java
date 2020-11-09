package com.example.cloud_consumer_8200.fallback;

import com.example.cloud_consumer_8200.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserService {
    @Override
    public String t1() {
        return "this is error";
    }
}
