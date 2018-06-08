package com.example.java.projecteuler;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 翻译：如果列出小于10的所有是3或5的倍数的自然数，有3丶5丶6和9，它们的和是23。
 * 现在请你算出所有1000以下为3或5的倍数的自然数的和。
 **/
public class problem000001 {

    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("结果 --> " + sum);
    }
}
