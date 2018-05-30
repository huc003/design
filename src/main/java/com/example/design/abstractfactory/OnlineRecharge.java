package com.example.design.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 抽象工厂模式-网银充值实现类
 **/
@Slf4j
public class OnlineRecharge implements Recharge{

    @Override
    public void recharge(String str) {
        log.info("{} -> 网银充值开始.....",str);
    }
}
