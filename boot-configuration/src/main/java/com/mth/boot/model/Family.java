package com.mth.boot.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/14
 **/
@Data
@Component
@ConfigurationProperties(prefix = "family")
@Validated
@PropertySource(value = {"classpath:family.properties"})
public class Family {
//    @Value("${family.family-name}")
    @Length(min = 5, max = 20, message = "家庭名称长度必须在5-20位之间")
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;
}
