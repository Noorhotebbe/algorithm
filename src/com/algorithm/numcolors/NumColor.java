package com.algorithm.numcolors;

import java.util.HashSet;
import java.util.Set;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2021/9/25
 * @Content:
 *      开幕式烟火：
 *         开幕式开始了，空中绽放了一颗二叉树形的巨型焰火。
 *         给定一棵二叉树 root 代表焰火，节点值表示巨型焰火这一位置的颜色种类。
 *         请帮小扣计算巨型焰火有多少种不同的颜色。
 *
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}

class Solution {

    Set<Integer> set = new HashSet<>();
    public int numColor(TreeNode root) {

//        HashMap<Integer, Integer> map = new HashMap<>();
//        judge(root,map);
//        return map.size();

        judge(root);
        return set.size();

    }

    public void judge(TreeNode root){
        if (root==null){
            return;
        }
        set.add(root.val);
        judge(root.left);
        judge(root.right);
//        map.put(root.val,1);
//        judge(root.left,map);
//        judge(root.right,map);
    }
}