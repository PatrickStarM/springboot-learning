package com.mth.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "demo_jpa")
public class People {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;

}
