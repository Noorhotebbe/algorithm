package com.algorithm.linkedlist.reverselinkedlist;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-14 09:38
 * @Description: 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class Reverse {
    public ListNode reverseList(ListNode head) {
        if (head == null ||head.next == null){
            return head;
        }

        //迭代法
        //当前节点的前一个节点
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            //用于后移，当前指针的下一个节点
            ListNode nextTemp = cur.next;
            //当前节点指向前一个节点
            cur.next = pre;
            //前一个节点后移
            pre = cur;
            //当前节点后移
            cur = nextTemp;
        }
        return pre;

        //递归法
        /*ListNode root = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return root;*/
    }
}
