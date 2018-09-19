package com.xu.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuhongda
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.xu.dubbo.consumer")
public class SpringbootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerApplication.class, args);
    }
}
