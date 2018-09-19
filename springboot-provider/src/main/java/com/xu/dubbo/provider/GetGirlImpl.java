package com.xu.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.xu.pojo.Girl;
import com.xu.service.GetGirlService;

/**
 * @author xuhongda on 2018/9/19
 * com.xu.dubbo.com.xu.provider
 * springboot-dubbo
 */
@Service(timeout = 5000)
public class GetGirlImpl implements GetGirlService {
    @Override
    public Girl get() {
        Girl girl = new Girl();
        girl.setAge("18");
        girl.setName("yan");
        return girl;
    }
}
