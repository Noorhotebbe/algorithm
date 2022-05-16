package com.algorithm.string.reverorder;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-16 09:17
 * @Description: 剑指 Offer 58 - I. 翻转单词顺序
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，
 * 标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 */
public class ReverseWord {
    public String reversWords(String str) {

        if (str.isEmpty()) return "";

        String trim = str.trim();
        StringBuilder res = new StringBuilder();
        int r = trim.length() - 1, i = r;

        while (i >= 0) {
            while (i >= 0 && trim.charAt(i) != ' ') i--;
            res.append(trim.substring(i + 1, r + 1) + " ");
            while (i >= 0 && trim.charAt(i) == ' ') i--;
            r = i;
        }

        /*String[] strings = trim.split("\\s+");
        for (int j = strings.length - 1; j >= 0; j--) {
            if (strings[j].equals("")){
                continue;
            }

            if (i == 0){
                res.append(strings[j].trim());
            }else {
                res.append(strings[j].trim()).append(" ");
            }
        }*/

        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String words = new ReverseWord().reversWords(s);
        System.out.println(words);
    }
}
