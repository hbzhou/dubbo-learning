package com.htisec.dubbo.spring.service.imp;

import com.htisec.dubbo.spring.service.HelloWorldService;

import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHelloWorld(String greetings) {
        return "Hello world, " + greetings;
    }
}
