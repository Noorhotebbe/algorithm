package com.algorithm.linkedlist.delete;

import com.algorithm.linkedlist.reverselinkedlist.ListNode;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-25 10:28
 * @Description: 返回删除指定节点后的链表
 */
public class DeleteNode {
    public ListNode delete(ListNode head, int val) {

        if (head == null){
            return null;
        }

        if (head.val == val) return head.next;

        //单指针
//        ListNode root = head;
//        while (root.next != null && root.next.val != val){
//            root = root.next;
//        }
//
        //说明当前节点的下一个节点的值等于指定值
//        if (root.next != null){
//            root.next = root.next.next;
//        }

        //递归
        head.next = delete(head.next, val);

        return head;
    }
}
