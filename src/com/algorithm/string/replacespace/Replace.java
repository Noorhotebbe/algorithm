package com.algorithm.string.replacespace;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-19 11:08
 * @Description: 替换空格
 */
public class Replace {
    public static String replaceSpace(String s) {
        if (s.isEmpty()) {
            return s;
        }

        //单线程，速度快,创建一个对象对字符串进行复制，若是空格则替换
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (" ".equals(String.valueOf(s.charAt(i)))){
                builder.append("%20");
            }else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();

//        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
