package com.example.design.observer;

import java.util.Map;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 推送信息给订阅者
 **/
public class IActivityPush {

    public void activityTender(Map<String, Object> params){
        IActivityWatcher iActivityWatcher = new Activity002();
        iActivityWatcher.login(params);
    }
}
