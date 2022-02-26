package com.algorithm.palindrome;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2021/9/24
 * @Content: 回文数：给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        /*
         * 特殊情况：由题意可知当x小于0时，一定不是回文数
         * 当x最后一个数为0时，为了使x回文，那么第一个数也应该为0。
         * */
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return x == y || x == y / 10;
    }
}
