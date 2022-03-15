package com.algorithm.tree.treetraversal.preorder;

import com.algorithm.tree.treetraversal.inorder.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-09 17:31
 * @Description: 迭代法遍历二叉树
 */
public class Preorder {

    /**
     * 前序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}
