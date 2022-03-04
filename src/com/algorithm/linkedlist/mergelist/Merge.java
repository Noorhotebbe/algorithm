package com.algorithm.linkedlist.mergelist;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-23 09:04
 * @Description:
 *      合并两个有序列表：
 *          将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Merge {
    public static ListNode mergeTwoList(ListNode list1, ListNode list2){

//        ListNode prehead = new ListNode(-1);
//        ListNode temp  = prehead;
//
//        while (list1 != null && list2 != null){
//
//            if (list1.val < list2.val){
//                temp.next = list1;
//                list1 = list1.next;
//            }else {
//                temp.next = list2;
//                list2 = list2.next;
//            }
//            temp = temp.next;
//        }
//        temp.next = list1 == null ? list2 : list1;
//        return prehead.next;

        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else if (list1.val < list2.val){
            list1.next = mergeTwoList(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoList(list1,list2.next);
            return list2;
        }

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(4, new ListNode(5)));
        Merge.mergeTwoList(l1, l2);
    }
}
