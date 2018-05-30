package com.example.design.abstractfactory;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-抽象工厂
 **/
public abstract class AbstractFactory {
    public abstract Recharge getRecharge(String rechargeType);
    public abstract Withdraw getWithdraw(String withdrawType);
}
