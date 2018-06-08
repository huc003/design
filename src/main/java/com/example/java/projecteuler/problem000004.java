package com.example.java.projecteuler;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description: A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 翻译：假如一个数前后掉转后还是同一个数的话，那个数就叫做「回文数」。
 * 由两个二位数的积构成的最大回文数是9009 = 91 × 99。
 * 请找出由两个三位数的积构成的最大回文数。
 **/
public class problem000004 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int max = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j < 999; j++) {
                int a = j * i;
                if (!number(a + "")) {
                    continue;
                }
                if (max < a) {
                    max = a;
                }
            }
        }
        System.out.println("最大回文数：" + max);
    }

    public static boolean number(String number) {
        char[] c = number.toCharArray();
        String inverted = "";
        for (int i = c.length - 1; i >= 0; i--) {
            inverted += c[i];
        }
        if (number.equals(inverted)) {
            return true;
        }
        return false;
    }
}
