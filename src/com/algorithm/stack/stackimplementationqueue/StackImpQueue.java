package com.algorithm.stack.stackimplementationqueue;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-16 09:18
 * @Description: 两个栈实现队列
 */
public class StackImpQueue {

    private Stack<Integer> a;
    private Stack<Integer> b;

    public StackImpQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void appendTail(int value) {
        a.push(value);
    }

    public int deleteHead() {
        if (b.isEmpty()){
            while (!a.isEmpty()){
                b.push(a.pop());
            }
        }

        return a.isEmpty() && b.isEmpty() ? -1 : b.pop();
    }

}
