package com.example.design.recharge;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 快捷充值实现类
 **/
@Slf4j
public class FastRecharge extends AbstractRecharge{
    @Override
    public void rechargeDo(String str) {
        log.info("{} -> 快捷充值开始......",str);
    }

    @Override
    public void verification() {
        log.info("验证开始 -> 快捷充值......");
    }
}
