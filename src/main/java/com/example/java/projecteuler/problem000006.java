package com.example.java.projecteuler;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description: The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 翻译：前十个正整数的平方和是：12 + 22 + ... + 102 = 385
 * 前十个正整数的和的平方是：(1 + 2 + ... + 10)2 = 552 = 3025
 * 因此前十个正整数的和的平方，与前十个正数整数的平方和，的差是2640。
 * 现在请你求出前一百个正整数的和的平方与前一百个正整数的平方和的差。
 * 思路：平方和1*1+2*2....+10*10 = 385
 * 和平方(1+2+3.......+10)*(1+2+3.......+10) = 3025
 **/
public class problem000006 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int square = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            square += i * i;
            sum += i;
        }
        System.out.println(sum * sum - square);
    }
}
