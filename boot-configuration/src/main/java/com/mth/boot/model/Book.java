package com.mth.boot.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Data
public class Book {
    @NotNull
    private String name;
    @NotNull
    private Integer price;
    @Past
    private Date publish;
}
