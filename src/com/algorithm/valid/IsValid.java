package com.algorithm.valid;

import java.util.Stack;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-22 09:55
 * @Description: 有效的括号：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 */
public class IsValid {
    public boolean valid(String str) {


        //bug
//        if (str.length()%2 > 0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            str = str.replace("[]", "")
//                    .replace("{}", "")
//                    .replace("()", "");
//        }
//        return str.length() == 0;

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid valid = new IsValid();
        String s = "(([]){})";
        boolean b = valid.valid(s);
        System.out.println(b);
    }
}
