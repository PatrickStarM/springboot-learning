package com.mth.boot.model;

import com.mth.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @description: @Configuration注解，表示本类为一个配置类
 * @author: mth
 * @date: 2022/3/14
 **/
@Data
@Configuration
@PropertySource(name = "employeeProperties", value = {"classpath:employee.properties"})

public class Employee {
    /**
     * 使用SpEL 读取 employee.properties配置文件
     */
    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeName;

    @Value("#{'${employee.names}'.split(',')[0]}")
    private String firstName;

    @Value("#{${employee.age}}")
    private Map<String, Integer> employeeAge;

    @Value("#{${employee.age}['four'] != null ? ${employee.age}['four']:55}")
    private Integer ageWithDefaultValue;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;



}
