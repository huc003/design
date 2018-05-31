package com.example.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 类描述
 **/
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<>();
        personList.forEach(person -> {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        });
        return femalePersons;
    }
}
