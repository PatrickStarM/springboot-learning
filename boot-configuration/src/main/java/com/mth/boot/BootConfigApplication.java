package com.mth.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Slf4j
@SpringBootApplication

public class BootConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootConfigApplication.class, args);
        log.info("服务启动成功");
    }

}
