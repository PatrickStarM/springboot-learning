package com.mth.boot.util;

import org.jasypt.encryption.StringEncryptor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/15
 **/
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserEncryptTest {
    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void getPass() {
        String name = encryptor.encrypt("Tian_Hao");
        String age = encryptor.encrypt("18");
        System.out.println("database name: " + name);
        System.out.println("database age: " + age);

    }
}
