package com.algorithm.linkedlist.mergelist;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-23 09:04
 * @Description:
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){}

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

//    public int size(ListNode node){
//        int length = 0;
//        ListNode temp = node;
//        if (node.next == null) return 0;
//        while (temp != null){
//            length++;
//            temp = temp.next;
//        }
//        return length;
//    }
}
