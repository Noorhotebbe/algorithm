package com.algorithm.tree.binarytreedepth;

import com.algorithm.tree.treetraversal.inorder.TreeNode;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-02 10:19
 * @Description: 二叉树的深度：
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class BinaryTree {

    public int maxDepth(TreeNode root) {

        //最后的+1是加上根节点深度
        return root == null ? 0 : Math.max(maxDepth(root.left), (maxDepth(root.right))) + 1;

        //广度优先搜索
//        if (root == null){
//            return 0;
//        }
//
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        int depth = 0;
//        queue.offer(root);
//
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            while (size > 0){
//                TreeNode node = queue.poll();
//                if (node.left != null){
//                    queue.offer(node.left);
//                }
//                if (node.right != null){
//                    queue.offer(node.right);
//                }
//                size--;
//            }
//            depth++;
//        }
//        return depth;
    }
}
