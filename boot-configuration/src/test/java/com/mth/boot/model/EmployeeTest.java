package com.mth.boot.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    void valueBind() throws Exception {
        log.info(String.valueOf(employee));

        Map<String, Integer> map = employee.getEmployeeAge();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("name = " + entry.getKey() + ", age = " + entry.getValue());
        }
    }

//    @Test
//    public void testList() {
//        List<String> list = List.of("aaa", "bbb", "ccc");
//        list.forEach(System.out::println);
//
//    }


}