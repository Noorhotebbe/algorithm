package com.algorithm.dynamicprogramming.numbertranslation;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-15 16:59
 * @Description: 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，
 * ……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 */
public class TranslationNumber {
    public static int translateNum(int num) {
        if (num < 10) return 1;

        int a = 1, b = 1, c, x, y = num % 10;
        while (num != 0) {
            num = num / 10;
            x = num % 10;
            int res = 10 * x + y;
            c = res >= 10 && res < 26 ? a + b : a;
            b = a;
            a = c;
            y = x;
        }
        return a;
    }

    public static void main(String[] args) {
        int i = translateNum(24547);
        System.out.println(i);
    }
}
