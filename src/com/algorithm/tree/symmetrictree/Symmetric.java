package com.algorithm.tree.symmetrictree;

import com.algorithm.tree.treetraversal.TreeNode;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-27 17:30
 * @Description:
 *      对称二叉树：
 *          给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class Symmetric {
    public boolean isSymmetric(TreeNode root){

        if (root == null) {
            return true;
        }
        return subtree(root.left,root.right);


        //迭代解法
//        if (root == null) return true;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root.left);
//        queue.offer(root.right);
//
//        while (!queue.isEmpty()){
//            TreeNode node1 = queue.poll();
//            TreeNode node2 = queue.poll();
//
//            if (node1 == null && node2 == null) continue;
//
//            if (node1 == null || node2 == null || node1.val != node2.val){
//                return false;
//            }
//
//            queue.add(node1.left);
//            queue.add(node2.right);
//            queue.add(node1.right);
//            queue.add(node2.left);
//        }
//        return true;

    }

    /**
     * 递归解法
     * @param left
     * @param right
     * @return
     */
    public boolean subtree(TreeNode left, TreeNode right){

        if (left == null && right == null) {
            return true;
        }
        if (left ==null || right == null || left.val != right.val) {
            return false;
        }

        return subtree(left.left,right.right) && subtree(left.right,right.left);
    }
}
