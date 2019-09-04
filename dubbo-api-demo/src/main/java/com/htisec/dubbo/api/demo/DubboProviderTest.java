package com.htisec.dubbo.api.demo;

import com.htisec.dubbo.api.demo.service.EchoService;
import com.htisec.dubbo.api.demo.service.imp.EchoServiceImpl;

import java.util.concurrent.CountDownLatch;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

/**
 * @author jeremy
 */
public class DubboProviderTest {

    private static final String ZOOKEEPER_Address = "mse-ecd283d1-p.zk.mse.aliyuncs.com:2181";

    public static void main(String[] args) throws Exception {
        ServiceConfig<EchoService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(new ApplicationConfig("echo-service-provider"));
        serviceConfig.setRegistry(new RegistryConfig(ZOOKEEPER_Address,"zookeeper"));
        serviceConfig.setInterface(EchoService.class);
        serviceConfig.setRef(new EchoServiceImpl());
        serviceConfig.setProtocol(new ProtocolConfig("dubbo"));
        serviceConfig.export();
        new CountDownLatch(1).await();

    }
}
