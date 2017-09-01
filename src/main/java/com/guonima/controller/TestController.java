package com.guonima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guonima
 * @create 2017-09-01 14:27
 */
@RestController
public class TestController {

    @RequestMapping(value = "/index")
    public String hello(){
        return "hello world! Spring Boot";
    }

    @RequestMapping(value = "/json")
    public Map json (){
        Map a = new HashMap();
        a.put("name","hello");
        a.put("age", 42);
        a.put("address", "small future");
        return a;
    }
}
