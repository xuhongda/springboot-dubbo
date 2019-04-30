package com.xu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author xuhongda on 2018/9/19
 * com.xu.pojo
 * springboot-dubbo
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Girl implements Serializable {
    private String name;
    private String age;
}
