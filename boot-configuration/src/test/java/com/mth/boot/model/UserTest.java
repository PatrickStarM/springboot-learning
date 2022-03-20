package com.mth.boot.model;

import com.mth.boot.BootConfigApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserTest {
    @Autowired
    private User user;

    @Test
    void printUser() {
        System.out.println(user);
    }


}