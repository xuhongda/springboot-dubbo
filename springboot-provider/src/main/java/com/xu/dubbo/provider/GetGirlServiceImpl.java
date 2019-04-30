package com.xu.dubbo.provider;

import com.xu.pojo.Girl;
import com.xu.service.GetGirlService;
import org.springframework.stereotype.Service;

/**
 * @author xuhongda on 2018/9/19
 * com.xu.dubbo.com.xu.provider
 * springboot-dubbo
 */
@Service
public class GetGirlServiceImpl implements GetGirlService {
    @Override
    public Girl get() {
        Girl girl = new Girl();
        girl.setAge("18");
        girl.setName("yan");
        return girl;
    }
}
