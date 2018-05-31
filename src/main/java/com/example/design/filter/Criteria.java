package com.example.design.filter;

import java.util.List;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 过滤器模式-接口
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}