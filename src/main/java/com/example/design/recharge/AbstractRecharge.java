package com.example.design.recharge;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 充值抽象类
 **/
@Slf4j
public abstract class AbstractRecharge {

    /**
     * @Author: 胡成
     * @Date:   2018/5/30 16:03
     * @Description: 充值具体业务实现类
    **/
    public abstract void rechargeDo(String str);

    /**
     * @Author: 胡成
     * @Date:   2018/5/30 16:04
     * @Description: 充值验证方法
    **/
    public abstract void verification();

    /**
     * @Author: 胡成
     * @Date:   2018/5/30 16:04
     * @Description: 充值入口
    **/
    public void recharge(String str){
        log.info("{} -> 充值开始......",str);
        //验证开始
        verification();
        //充值业务实现开始
        rechargeDo(str);
    }
}
