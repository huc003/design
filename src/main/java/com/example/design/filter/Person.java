package com.example.design.filter;

import lombok.Data;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 过滤器模式-javaBean
 **/
@Data
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
