package com.algorithm.string.rotatestringleft;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-22 09:16
 * @Description: 左旋转字符串
 */
public class ReverseLeftString {
    public static String reverseLeft(String s, int n) {
        if (s.isEmpty() || n <= 0 || n > s.length()) {
            return s;
        }

        //substring左闭右开
        String sub = s.substring(0, n);
        StringBuilder builder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            builder.append(s.charAt(i));
        }
        builder.append(sub);

        return builder.toString();
    }

    public static void main(String[] args) {
        String s = "bcdedit";
        int n = 2;
        System.out.println(reverseLeft(s, n));
    }
}
