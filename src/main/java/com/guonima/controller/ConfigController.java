package com.guonima.controller;

import com.guonima.beans.ConfigBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guonima
 * @create 2017-09-01 13:57
 */
@RestController
public class ConfigController {

    @Autowired
    private ConfigBeans configBeans;

    /**
     * 通过使用Value注解绑定application.properties文件中配置的信息
     * 存在中文乱码
     */
    @Value("${app.guonima.name}")
    private String name;

    @Value("${app.guonima.age}")
    private String age;

    @RequestMapping(value = "/config")
    public String config(){
        return "名称：" + name + ",年龄：" + age + ";  <br />" +
               "名称2：" + configBeans.getName() + ",年龄2：" +  configBeans.getAge();
    }
}
