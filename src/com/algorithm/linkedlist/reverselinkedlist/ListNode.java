package com.algorithm.linkedlist.reverselinkedlist;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-14 09:42
 * @Description:
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
