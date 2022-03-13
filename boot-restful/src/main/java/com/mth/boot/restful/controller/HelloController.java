package com.mth.boot.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/13
 **/
@RestController
@RequestMapping(value = "hello")
public class HelloController {
    @GetMapping("world")
    public String getHelloWorld() {
        return "hello world";
    }
}
