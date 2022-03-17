package com.algorithm.linkedlist.reverseprintlist;

import com.algorithm.linkedlist.reverselinkedlist.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-17 09:25
 * @Description: 从尾到头打印一个链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class PrintReverse {
    public int[] print(ListNode head) {

        if (head == null) {
            return new int[0];
        }

        //用栈
        /*Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }

        return res;*/

        //反转链表
        ListNode pre = null;
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            ListNode newNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = newNode;
            ++count;
        }

        int[] res = new int[count];
        cur = head;
        for (int i = 0; i < count; i++) {
            res[i] = pre.val;
            pre = pre.next;
        }

        return res;
    }
}
