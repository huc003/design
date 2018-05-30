package com.example.design.builder;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 建造者模式-瓶子
 **/
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "瓶子";
    }
}
