package com.algorithm.linkedlist.getknode;

import com.algorithm.linkedlist.reverselinkedlist.ListNode;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-24 09:26
 * @Description:
 */
public class GetNode {

    /**
     * 获取链表中倒数第k个节点的链表:
     * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
     * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode getKNode(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode later = head;

        while (pre != null && k-- > 0) {
            pre = pre.next;
        }

        if (k > 0) {
            return null;
        }

        while (pre != null) {
            pre = pre.next;
            later = later.next;
        }

        return later;
    }
}
