package com.example.design.singleton;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 单例模式
 **/
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSynSingleton());
    }
}
