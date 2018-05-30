package com.example.design.abstractfactory;

import lombok.extern.slf4j.Slf4j;
/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-快捷充值实现类
 **/
@Slf4j
public class FastRecharge implements Recharge{

    @Override
    public void recharge(String str) {
        log.info("{} -> 快捷充值开始......",str);
    }
}
