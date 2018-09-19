package com.xu.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xu.pojo.Girl;
import com.xu.service.GetGirlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuhongda on 2018/9/19
 * com.xu.dubbo.com.xu.consumer
 * springboot-dubbo
 */
@RestController
public class ConsumerGirl {

    @Reference(version = "1.0.0")
    private GetGirlService getGirlService;

    @GetMapping("getGirl")
    public Girl getGirl(){
        return getGirlService.get();
    }

}
