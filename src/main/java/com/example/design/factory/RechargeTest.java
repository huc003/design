package com.example.design.factory;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 工厂模式
 **/
public class RechargeTest {
    public static void main(String[] args) {
        Recharge recharge = RechargeFactory.recharge("fast");
        recharge.recharge("张三");
    }
}
