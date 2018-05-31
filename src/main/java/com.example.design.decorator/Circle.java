package com.example.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 装饰器模式-实现类
 **/
@Slf4j
public class Circle implements Shape{
    @Override
    public void draw() {
        log.info("Shape：Circle");
    }
}
