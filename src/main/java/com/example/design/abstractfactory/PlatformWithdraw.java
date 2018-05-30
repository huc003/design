package com.example.design.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-平台提现实现类
 **/
@Slf4j
public class PlatformWithdraw implements Withdraw{
    @Override
    public void withdraw(String str) {
        log.info("{} -> 平台提现开始......",str);
    }
}
