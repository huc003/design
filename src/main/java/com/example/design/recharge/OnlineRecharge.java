package com.example.design.recharge;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 网银充值实现类
 **/
@Slf4j
public class OnlineRecharge extends AbstractRecharge{

    @Override
    public void rechargeDo(String str) {
        log.info("{} -> 网银充值开始......",str);
    }

    @Override
    public void verification() {
        log.info("验证开始 -> 网银充值......");
    }
}
