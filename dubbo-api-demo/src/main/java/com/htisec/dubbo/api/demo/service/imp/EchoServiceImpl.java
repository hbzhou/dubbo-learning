package com.htisec.dubbo.api.demo.service.imp;

import com.htisec.dubbo.api.demo.service.EchoService;

public class EchoServiceImpl implements EchoService {

    @Override
    public String sayHello(String name) {
        return "Hello, "+ name;
    }
}
