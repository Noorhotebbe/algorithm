package com.algorithm.string.stringlength;

import java.util.HashMap;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-04 09:19
 * @Description: 无重复的最长子串：
 * 给定一个字符串s ，请你找出其中不含有重复字符的最长子串的长度。
 */
public class LongSubString {

    public int length(String s) {

        if (s.length() == 0) {
            return 0;
        }

        //max是不重复子串的长度，left是元素序列比较是否重复的起始下标
        int maxlength = 0, left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //每次判断map中是否有重复元素，若有，遍历下标则后移一位
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }

            //不管是否map中有重复元素，每次都会更新元素的索引位置。
            map.put(s.charAt(i), i);
            //i-left+1:指的是当前下标减去起始下标，+1是因为是从下标0开始的，最终比较得到最长的长度
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;

    }

    public static void main(String[] args) {
        String str = "hdjasfda";
        System.out.println(new LongSubString().length(str));
    }
}
