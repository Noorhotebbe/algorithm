package com.algorithm.linkedlist.copyrandomlist;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-18 09:18
 * @Description:
 */
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
