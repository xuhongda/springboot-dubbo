package com.xu.dubbo.consumer;

import com.xu.pojo.Girl;
import com.xu.service.GetGirlService;
import com.xu.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuhongda on 2018/9/19
 * com.xu.dubbo.com.xu.consumer
 * springboot-dubbo
 */
@RestController
public class ConsumerGirl {


    private final TestService testService;

    private final GetGirlService getGirlService;

    public ConsumerGirl(TestService testService, GetGirlService getGirlService) {
        this.getGirlService = getGirlService;
        this.testService = testService;
    }


    @GetMapping("test")
    public String test() {
        return testService.test();
    }

    @GetMapping("getGirl")
    public Girl getGirl() {
        return getGirlService.get();
    }

}
