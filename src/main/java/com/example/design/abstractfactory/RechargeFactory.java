package com.example.design.abstractfactory;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-充值工厂类
 **/
public class RechargeFactory extends AbstractFactory{

    @Override
    public Recharge getRecharge(String rechargeType) {
        String fastType = "fast";
        if(fastType.equals(rechargeType)){
            return new FastRecharge();
        }
        return new OnlineRecharge();
    }

    @Override
    public Withdraw getWithdraw(String withdrawType) {
        return null;
    }
}
