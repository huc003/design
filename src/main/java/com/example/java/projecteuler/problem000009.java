package com.example.java.projecteuler;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description: A Pythagorean triplet is a set of three natural numbers,
 * a < b < c, for which,a2 + b2 = c2For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 翻译：勾股数组就是三个自然数a, b, c：a2 + b2 = c2 (a < b < c)
 * 例如，32 + 42 = 9 + 16 = 25 = 52。
 * 现存在唯一的勾股数组a, b, c，且a + b + c = 1000。请求出这三个数的乘积。
 **/
public class problem000009 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int a, b, c, th = 1000,d = 1000;
        for (b = 1; b < th; b++) {
            c = (th * th + 2 * b * b - 2 * th * b) / (2 * th - 2 * b);
            a = th - b - c;
            if (a < b && b < c && a < c && a * a + b * b == c * c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(a * b * c);
                return;
            }
        }
//        for (int a = 1; a < 999; a++) {
//            for (int b = 1; b < 999; b++) {
//                for (int c = 1; c < 999; c++) {
//                    if (a * a + b * b == c * c && a < b && a < c && b < c && a + b + c == 1000) {
//                        System.out.println(a);
//                        System.out.println(b);
//                        System.out.println(c);
//                        System.out.println(a * b * c);
//                    }
//                }
//            }
//        }
    }
}
