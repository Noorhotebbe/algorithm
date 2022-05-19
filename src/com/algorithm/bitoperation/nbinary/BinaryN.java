package com.algorithm.bitoperation.nbinary;

import java.util.Arrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-19 11:54
 * @Description: 剑指 Offer II 003. 前 n 个数字二进制中 1 的个数
 * 给定一个非负整数 n ，请计算 0 到 n 之间的每个数字的二进制表示中 1 的个数，并输出一个数组。
 */
public class BinaryN {
    public int[] countBits(int n){
        int[] res = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            res[i] = res[i >> 1] + (i % 2);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] count = new BinaryN().countBits(9);
        System.out.println(Arrays.toString(count));
    }
}
