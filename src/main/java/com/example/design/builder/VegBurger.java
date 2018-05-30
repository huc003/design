package com.example.design.builder;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 建造者模式-素食汉堡
 **/
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
