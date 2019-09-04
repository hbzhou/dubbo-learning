package com.htisec.dubbo.boot.provider.consumer.service.impl;

import com.htisec.dubb.boot.api.service.DemoService;
import com.htisec.dubbo.boot.provider.consumer.service.ConsumerService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(check = false)
    private DemoService demoService;

    @Override
    public String sayDemo(String name) {
        return demoService.sayHi(name);
    }
}
