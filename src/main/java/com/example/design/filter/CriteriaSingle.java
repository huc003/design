package com.example.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 类描述
 **/
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();
        personList.forEach(person -> {
            if(person.getGender().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        });
        return singlePersons;
    }
}
