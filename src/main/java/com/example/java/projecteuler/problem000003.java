package com.example.java.projecteuler;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 翻译：13195的质因数有5丶7丶13丶29。
 * 问：600851475143的最大质因数是……？
 * 思路：分解质因数a/2=c,c/2=d,d/2=e,e/2=f
 **/
public class problem000003 {

    public static void main(String[] args) {
        getResult(600851475143L);
    }

    public static void getResult(long parameter) {
        long max = 0;
        for (int i = 2; i <= parameter; i++) {
            if (parameter % i == 0) {
                parameter = parameter / i;
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
}
