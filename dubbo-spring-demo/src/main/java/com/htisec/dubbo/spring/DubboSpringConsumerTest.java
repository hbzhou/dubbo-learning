package com.htisec.dubbo.spring;

import com.htisec.dubbo.spring.service.HelloWorldService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboSpringConsumerTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        HelloWorldService helloWorldService = applicationContext.getBean(HelloWorldService.class);

        System.out.println(helloWorldService.sayHelloWorld("what's man"));

    }
}
