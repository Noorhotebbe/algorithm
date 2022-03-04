package com.algorithm.linkedlist.addnumbers;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-01 09:17
 * @Description:
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
