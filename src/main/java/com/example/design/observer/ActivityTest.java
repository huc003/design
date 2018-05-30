package com.example.design.observer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 类描述
 **/
public class ActivityTest {
    public static void main(String[] args) {
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("user_id",1264526);
        new IActivityPush().activityTender(params);
    }
}
