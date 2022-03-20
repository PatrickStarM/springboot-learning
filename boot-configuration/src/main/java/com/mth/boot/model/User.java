package com.mth.boot.model;

import com.mth.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Data
@Component
@ConfigurationProperties(prefix = "user")
@Validated
@PropertySource(value = {"classpath:user.yml"}, factory = MixPropertySourceFactory.class)
public class User {
    @NotNull
    private String name;
    @NotNull
    private Integer age;

    @Valid
    private Book book;
}
