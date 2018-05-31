package com.example.design.filter;

import java.util.List;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 类描述
 **/
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;


    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(personList);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(personList);

        otherCriteriaItems.forEach(person -> {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        });
        return firstCriteriaItems;
    }
}
