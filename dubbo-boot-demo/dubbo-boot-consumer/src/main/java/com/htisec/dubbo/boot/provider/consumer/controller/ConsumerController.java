package com.htisec.dubbo.boot.provider.consumer.controller;


import com.htisec.dubbo.boot.provider.consumer.service.ConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;


    @GetMapping("/demo/{name}")
    public String sayDemo(@PathVariable(name = "name") String name) {
        return consumerService.sayDemo(name);
    }


}
