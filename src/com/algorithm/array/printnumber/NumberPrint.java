package com.algorithm.array.printnumber;

import java.util.Arrays;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-25 09:28
 * @Description: 打印输入数字的n位数，从1开始打印到10的n次方-1
 */
public class NumberPrint {
    public int[] printNumbers(int n) {
        if (n == 0) {
            return new int[0];
        }

        //不考虑大数的情况下
        int length = (int) Math.pow(10, n);
        int[] res = new int[length - 1];
        for (int i = 1; i <= res.length; i++) {
            res[i - 1] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new NumberPrint().printNumbers(2)));
    }
}
