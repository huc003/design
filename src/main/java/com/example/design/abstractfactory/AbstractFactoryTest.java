package com.example.design.abstractfactory;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-测试类
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory rechargeFactory = FactoryProducer.getFactory("recharge");
        Recharge recharge = rechargeFactory.getRecharge("fast");
        recharge.recharge("张三");


        rechargeFactory = FactoryProducer.getFactory("withdraw");
        Withdraw withdraw = rechargeFactory.getWithdraw("personal");
        withdraw.withdraw("张三");
    }
}
