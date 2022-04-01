package com.algorithm.tree.levelordertraversal;

import com.algorithm.tree.treetraversal.inorder.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-03-30 11:59
 * @Description: 二叉树的层序遍历
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 */
public class LevelOrder {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        int[] ints = new int[list.size()];
        for (int i = 0;   i < ints.length; i++) {
            ints[i] = list.get(i);
        }

        return ints;
    }

}
