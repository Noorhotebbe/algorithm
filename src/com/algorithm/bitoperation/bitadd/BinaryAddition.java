package com.algorithm.bitoperation.bitadd;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-20 10:36
 * @Description: 二进制的加法
 */
public class BinaryAddition {
    public String addBinary(String a, String b){
        if (a.isEmpty() && b.isEmpty()) return "";

        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;

        int n = Math.max(a.length()- 1, b.length() - 1), carry = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            carry += i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            carry += i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            builder.append(carry % 2);
            carry /= 2;
        }

        if (carry > 0){
            builder.append('1');
        }

        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "0";
        String b = "0";

        String s = new BinaryAddition().addBinary(a, b);
        System.out.println(s);
    }
}
