package com.example.dubboprovider.service.impl;

import com.example.dubboapi.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String demo() {
        return "This is a provider";
    }
}
