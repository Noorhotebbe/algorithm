package com.algorithm.linkedlist.copyrandomlist;


import com.algorithm.linkedlist.addnumbers.TwoNumbers;

import java.util.HashMap;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-18 09:18
 * @Description:
 */
public class RandomList {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return head;
        }

        //map中存的是原节点与拷贝节点的一个映射
        /*HashMap<Node, Node> map = new HashMap<>();
        for (Node cur = head; cur != null; cur = cur.next){
            map.put(cur,new Node(cur.val));
        }

        for (Node cur = head; cur != null; cur = cur.next){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }

        return map.get(head);*/

        //将复制节点拷一份链在此节点上，例：1->1`->2->2`....
        for (Node node = head, copy = null; node != null; node = node.next) {
            copy = new Node(node.val);
            copy.next = node.next;
            node.next = copy;
        }

        for (Node cur = head; cur != null; cur = cur.next.next) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
        }

        //拆分链表
        Node neaHead = head.next;
        for (Node cur = head, temp = null; cur != null; cur = cur.next.next){
            temp = cur.next;
            cur.next = temp.next;
            cur = temp;
        }

        return neaHead;
    }
}
