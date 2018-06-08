package com.example.java.projecteuler;

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
        getResult();
    }

    public static void getResult() {
        int j,sum=0;
        for (int i = 2; i < 2000000; i++) {
            j = 2;
            while (i % j != 0) {
                j++;
            }
            if(j==i){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
