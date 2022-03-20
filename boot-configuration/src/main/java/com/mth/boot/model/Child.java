package com.mth.boot.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}
