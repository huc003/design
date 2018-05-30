package com.example.design.builder;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 建造者模式-百事可乐
 **/
public class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
