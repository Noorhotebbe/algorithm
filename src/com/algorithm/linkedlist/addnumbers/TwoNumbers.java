package com.algorithm.linkedlist.addnumbers;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-01 09:13
 * @Description:
 *      两数相加：
 *          给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *          请你将两个数相加，并以相同形式返回一个表示和的链表。你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 */
public class TwoNumbers {
    public ListNode twoAddNums(ListNode l1, ListNode l2){

        ListNode resList = new ListNode(0);
        //变量保存进位
        int carry = 0;
        ListNode cur = resList;

        while (l1 !=  null || l2 != null || carry != 0){
            int sum = (l1 == null ? 0:l1.val) + (l2 == null ? 0:l2.val)+carry;
            //进位值
            carry = sum/10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;

            l1 = l1 == null?null : l1.next;
            l2 = l2 == null?null : l2.next;
        }
        return resList.next;
    }
}
