package com.mth.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot-learning
 * @Author: mth
 * @Description:
 * @Date: 2022/3/7
 * @Version: 1.0
 **/
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String getHello() {
        return "hello world rerere";
    }
}
