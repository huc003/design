package com.example.design.singleton;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/30
 * @Description: 单例模式
 **/
public class Singleton {

    private Singleton() {
    }

    private static Singleton singleton;
    private static Singleton synSingleton;

    /**
     * @Author: 胡成
     * @Date:   2018/5/30 16:23
     * @Description: 非线程安全的单例模式
    **/
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * @Author: 胡成
     * @Date:   2018/5/30 16:23
     * @Description: 线程安全的单例模式
    **/
    public static synchronized Singleton getSynSingleton() {
        if (synSingleton == null) {
            synSingleton = new Singleton();
        }
        return singleton;
    }

}
