package com.zjc.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.zjc.springboot.dubbo.consumer.quickstart.QuickstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = 
                SpringApplication.run(ConsumerApplication.class, args);
        //注解模式下bean的默认名称
        QuickstartConsumer quickstartConsumer = (QuickstartConsumer)run.getBean("quickstartConsumer");

        quickstartConsumer.sendMessage("Hello! Springboot-Dubbo");
    }

}
