package com.algorithm.linkedlist.reverselinkedlist;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-14 09:42
 * @Description:
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
