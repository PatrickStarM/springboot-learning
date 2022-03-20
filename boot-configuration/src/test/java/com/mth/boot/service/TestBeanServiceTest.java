package com.mth.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanServiceTest {
    //注入Spring的上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
        //从测试环境的Spring上下文中去读取xml配置文件，得到testBeanService，有的话xml配置就生效
//        boolean flag = ioc.containsBean("testBeanService");
//        assertTrue(flag);
        TestBeanService tbs =(TestBeanService) ioc.getBean("testBeanService");
//        log.info(this.getName());
        assertEquals("SpringBoot", tbs.getName());
        System.out.println(tbs.getName());

        TestBeanService tbs1 =(TestBeanService) ioc.getBean("testBeanService1");
        assertEquals("Test", tbs1.getName());
        System.out.println(tbs1.getName());




    }

}