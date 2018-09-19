package com.xu.pojo;

import java.io.Serializable;

/**
 * @author xuhongda on 2018/9/19
 * com.xu.pojo
 * springboot-dubbo
 */
public class Girl implements Serializable {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
