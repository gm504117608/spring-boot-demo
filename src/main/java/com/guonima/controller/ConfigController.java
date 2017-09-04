package com.guonima.controller;

import com.guonima.config.ConfigBeans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author guonima
 * @create 2017-09-01 13:57
 */
@RestController
public class ConfigController {

    private Logger logger = LoggerFactory.getLogger(ConfigController.class);

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

    public String getName() {
        try {
            return new String(name.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
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

    @RequestMapping(value = "/config")
    public String config() {
        logger.trace("日志trace");
        logger.debug("日志trace");
        logger.info("日志trace");
        logger.warn("日志trace");
        logger.error("日志trace");

        return "名称：" + getName() + ",年龄：" + age + ";  <br />" +
                "名称2：" + configBeans.getName() + ",年龄2：" + configBeans.getAge();
    }
}
