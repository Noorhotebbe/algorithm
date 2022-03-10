package com.algorithm.linkedlist.intersecting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-10 10:29
 * @Description: 相交链表
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null 。
 */
public class IntersectingLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //集合解法
        /*List<ListNode> nodes = new ArrayList<>();
        ListNode hA = headA, hB = headB;

        while (hA != null){
            nodes.add(hA);
            hA = hA.next;
        }

        while (hB != null){
            if (nodes.contains(hB)){
                return hB;
            }
            hB = hB.next;
        }
        return null;*/

        //双指针解法
        if (headA == null || headB == null) {
            return null;
        }

        ListNode hA = headA, hB = headB;

        /*
        链表长度相等时：
            当两个链表长度相等且不相交时，遍历一次都为null即会返回，
            相交且交点前长度相等时，也只会遍历一次遇到交点就返回。

        链表长度不同时：
            链表长度不同且不相交时，会遍历两次链表都为null返回，
            相交时，也会遍历两次链表直到遇到交点返回。
         */

        while (hA != hB){
            hA = hA == null ? headB : hA.next;
            hB = hB == null ? headA : hB.next;
        }
        return hA;

    }
}
