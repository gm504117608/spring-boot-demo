package com.guonima.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

/**
 * @author guonima
 * @create 2017-09-01 14:07
 */
@Configuration
@ConfigurationProperties(prefix = "app.guonima.test")
@PropertySource(value = "classpath:config/test.properties", encoding = "utf-8")
public class ConfigBeans implements Serializable {

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

    @Override
    public String toString() {
        return "ConfigBeans{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
