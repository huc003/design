package com.example.design.observer;

import java.util.Map;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 观察者模式
 **/
public interface IActivityWatcher {
    void login(Map<String, Object> params);
}
