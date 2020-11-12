package com.example.dubboconsumer.controller;

import com.example.dubboapi.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference
    DemoService demoService;

    @GetMapping
    public String demo() {
        return demoService.demo();
    }
}
