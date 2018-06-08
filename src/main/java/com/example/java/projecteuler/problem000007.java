package com.example.java.projecteuler;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/6/8
 * @Description:By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 翻译：通过列出前6个质数，我们可知第6个质数是13。
 * 那么第10001个质数是多少呢？
 * 思路：不能被其他整数整除，且等于自身就是质数
 **/
public class problem000007 {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult(){
        int j,n = 0,i = 2;
        for (;;) {
            j = 2;
            while (i % j != 0) {
                j++;
            }
            if (j == i) {
                n++;
                if(n==10001){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }

    }
}
