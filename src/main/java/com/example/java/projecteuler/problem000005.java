package com.example.java.projecteuler;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 翻译:2520是能被1到10的自然数整除的最小正整数。
 * 那么，能被1到20的自然数整除的最小正整数是……？
 **/
public class problem000005 {
    public static void main(String[] args) {
        getResult(20);
    }

    public static void getResult(int number) {
        int n = 0;
        int j = 1;
        for (; ; ) {
            for (int i = 1; i <= number; i++) {
                if (j % i != 0) {
                    j++;
                    i = 1;
                    continue;
                }
                n++;
            }
            if (n == number) {
                break;
            }
            n = 0;
        }
        System.out.println(j);
    }

}
