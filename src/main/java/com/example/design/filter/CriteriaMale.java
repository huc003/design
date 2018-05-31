package com.example.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 过滤器模式-
 **/
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<>();
        personList.forEach(person -> {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        });
        return malePersons;
    }
}
