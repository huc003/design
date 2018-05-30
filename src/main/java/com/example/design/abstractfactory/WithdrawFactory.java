package com.example.design.abstractfactory;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-提现工厂类
 **/
public class WithdrawFactory extends AbstractFactory{

    @Override
    public Recharge getRecharge(String rechargeType) {
        return null;
    }

    @Override
    public Withdraw getWithdraw(String withdrawType) {
        String personal = "personal";
        if(personal.equals(withdrawType)){
            return new PersonalWithdraw();
        }
        return new PlatformWithdraw();
    }
}
