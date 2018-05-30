package com.example.design.factory;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 工厂模式-充值工厂类
 **/
public class RechargeFactory {

    /**
     * @Author: 胡成
     * @Date:   2018/5/30 15:04
     * @Description: 返回充值类型
    **/
    public static Recharge recharge(String rechargeType){
        String fastRecharge = "fast";
        if (fastRecharge.equals(rechargeType)){
            return new FastRecharge();
        }
        return new OnlineRecharge();
    }

}
