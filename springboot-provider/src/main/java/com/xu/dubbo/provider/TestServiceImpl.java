package com.xu.dubbo.provider;

import com.xu.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author xuhongda on 2018/9/20
 * com.xu.dubbo.provider
 * springboot-dubbo
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "hello test";
    }

    @Override
    public Date getTime() {
        return new Date();
    }

    @Override
    public void xx() {

    }
}
