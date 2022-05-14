package com.algorithm.tree.binarybalancedtree;

import com.algorithm.tree.treetraversal.inorder.TreeNode;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-14 09:32
 * @Description: 剑指 Offer 55 - II. 平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */
public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public int getHeight(TreeNode root) {

        if (root == null) return 0;

        int leftHeight = getHeight(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = getHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
