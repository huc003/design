package com.example.java.projecteuler;

import java.util.BitSet;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 翻译：10以下的质数的和为2 + 3 + 5 + 7 = 17。
 * 请求出200,0000以下所有质数的和。
 **/
public class problem000010 {
    public static void main(String[] args) {
        getResult(2000000);
        getPrimeNumberSum(2000000);
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        double max = Math.sqrt(n);
        for (int i = 2; i <= max; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void getPrimeNumberSum(int n) {
        long start = System.currentTimeMillis();
        int i = 5;
        //由于2，3都是质数，初始值为5
        Long sum = 5L;
        while (i <= n) {
            //质数 不能被2整除
            if (isPrimeNumber(i += 2)) {
                sum += i;
            }
            //不能被3整除
            if (i <= n && isPrimeNumber(i += 4)) {
                sum += i;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("sum的值:"+sum);
        System.out.println("The time cost is " + (end - start));
    }

    private static void getResult(int n){
        long start = System.currentTimeMillis();
        long sum = 0;
        l:for(int i = 2; i < n; i ++) {
            //当j小于根号i的时候，继续循环。
            for(int j = 2; j < Math.sqrt(i); j ++){
                if(i % j == 0){
                    continue l;
                }
            }
            sum+=i;
        }
        System.out.println("sum的值:"+sum);
        long end = System.currentTimeMillis();
        System.out.println("The time cost is " + (end - start));
    }
}
