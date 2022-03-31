package com.algorithm.string.firstchar;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-29 11:28
 * @Description: 查找第一个只出现一次的字符
 */
public class FindChar {
    public char firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = 1;
            if (map.containsKey(c)) {
                count++;
            }
            map.put(c, count);
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1){
                return c;
            }
        }

        /*Map<Character, Boolean> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, !map.containsKey(c));
        }

        for (Map.Entry<Character, Boolean> m : map.entrySet()) {
            if (m.getValue()) {
                return m.getKey();
            }
        }*/

        return ' ';
    }

    public static void main(String[] args) {
        String s = "dddccdbba";
        char c = new FindChar().firstUniqChar(s);
        System.out.println(c);
    }
}
