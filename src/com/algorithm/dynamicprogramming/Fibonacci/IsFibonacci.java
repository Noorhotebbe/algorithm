package com.algorithm.dynamicprogramming.Fibonacci;

import com.sun.source.doctree.SummaryTree;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-07 10:29
 * @Description: 斐波那契数列
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class IsFibonacci {
    public int fib(int n) {
        if (n < 2) return n;

        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = dp[0] + dp[1];
            dp[0] = dp[1];

            //结果需要取模
            dp[1] = sum % 1000000007;
        }
        return sum;
    }

    public static void main(String[] args) {
        int fib = new IsFibonacci().fib(10);
        System.out.println(fib);
    }
}
