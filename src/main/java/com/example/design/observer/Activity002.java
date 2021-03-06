package com.example.design.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 订阅者活动001
 **/
@Slf4j
public class Activity002 implements IActivityWatcher{

    @Override
    public void login(Map<String, Object> params) {
        log.info("登录活动002开始......");
    }
}
