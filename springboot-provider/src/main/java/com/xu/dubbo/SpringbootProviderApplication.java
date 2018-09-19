package com.xu.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuhongda
 */
@SpringBootApplication
/*@DubboComponentScan(basePackages = "com.xu.dubbo.provider")*/
public class SpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProviderApplication.class, args);
    }
}
