package com.example.design.recharge;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 类描述
 **/
public class RechargeTest {
    public static void main(String[] args) {
        AbstractRecharge fastRecharge = RechargeFactory.recharge("fast");
        fastRecharge.recharge("张三");

        AbstractRecharge onlineRecharge = RechargeFactory.recharge("online");
        onlineRecharge.recharge("李四");
    }
}
