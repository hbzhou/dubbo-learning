package com.htisec.dubbo.api.demo;

import com.htisec.dubbo.api.demo.service.EchoService;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

public class DubboConsumerTest {

    private static final String ZOOKEEPER_ADDRESS = "mse-ecd283d1-p.zk.mse.aliyuncs.com:2181";


    public static void main(String[] args) {
        ReferenceConfig<EchoService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig("dubbo-consumer-demo"));
        referenceConfig.setRegistry(new RegistryConfig(ZOOKEEPER_ADDRESS,"zookeeper"));
        referenceConfig.setInterface(EchoService.class);
        referenceConfig.setCheck(false);
        EchoService echoService = referenceConfig.get();
        System.out.println(echoService.sayHello("dubbo"));

    }
}
