package com.algorithm.roman;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2021/10/11
 * @Content: 罗马数字转整数
 */
public class RomanInt {
    public static void main(String[] args) {
        int iv = new RomanInt().romanToInt("IV");
        System.out.println(iv);
    }
    public int romanToInt(String s) {

        s.replace("IV", "a");
        s.replace("IX", "b");
        s.replace("XL", "c");
        s.replace("XC", "d");
        s.replace("CD", "e");
        s.replace("CM", "f");

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += getValue(s.charAt(i));
        }
        return ans;

        //用HashMap解法
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("I", 1);
//        map.put("IV", 4);
//        map.put("V", 5);
//        map.put("IX", 9);
//        map.put("X", 10);
//        map.put("XL", 40);
//        map.put("L", 50);
//        map.put("XC", 90);
//        map.put("C", 100);
//        map.put("CD", 400);
//        map.put("D", 500);
//        map.put("CM", 900);
//        map.put("M", 1000);
//
//        int res = 0;
//        for (int i = 0; i < s.length(); ) {
//            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
//                res += map.get(s.substring(i, i + 2));
//                i += 2;
//            } else {
//                res += map.get(s.substring(i, i + 1));
//                i++;
//            }
//        }
//        return res;
    }

    public int getValue(char c) {
        //用Switch解法
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'a':
                return 4;
            case 'b':
                return 9;
            case 'c':
                return 40;
            case 'd':
                return 90;
            case 'e':
                return 400;
            case 'f':
                return 900;
            default:
                System.out.println("over!");
        }
        return 0;
    }
}
