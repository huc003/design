package com.example.design.abstractfactory;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-获取工厂
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        String rechargeType = "recharge";
        if (rechargeType.equals(type)){
            return new RechargeFactory();
        }
        return new WithdrawFactory();
    }
}
