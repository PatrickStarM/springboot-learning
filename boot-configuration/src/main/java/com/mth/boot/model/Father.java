package com.mth.boot.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Data
public class Father {
    private String name;

    @Min(value = 22, message = "爸爸的年龄不能小于22岁")
    private Integer age;

    @Email
    private String email;
}
