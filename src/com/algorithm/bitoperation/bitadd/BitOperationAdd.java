package com.algorithm.bitoperation.bitadd;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-06 10:16
 * @Description: 剑指 Offer 65. 不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 */
public class BitOperationAdd {
    public int add(int a, int b){

        int res = a ^ b;
        //保存进位
        int carry = (a & b) << 1;

        while (carry != 0){
            a = res;
            b = carry;
            res = a ^ b;
            carry = (a & b) << 1;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new BitOperationAdd().add(23, 11));
    }
}
