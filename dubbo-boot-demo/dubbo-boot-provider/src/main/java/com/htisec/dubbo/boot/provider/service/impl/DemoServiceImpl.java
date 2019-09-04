package com.htisec.dubbo.boot.provider.service.impl;


import com.htisec.dubb.boot.api.service.DemoService;

import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}
