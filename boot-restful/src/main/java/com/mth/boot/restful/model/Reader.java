package com.mth.boot.restful.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/10
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reader implements Serializable {

    private String name;
    private Integer age;

}
