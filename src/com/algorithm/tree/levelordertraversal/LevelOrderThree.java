package com.algorithm.tree.levelordertraversal;

import com.algorithm.tree.treetraversal.inorder.TreeNode;

import java.util.*;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-01 21:13
 * @Description: 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推
 */
public class LevelOrderThree {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {

            //奇数行
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.removeFirst();
                list.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(list);

            if (queue.isEmpty()) break;

            //偶数行
            list = new ArrayList<>();
            for (int i = queue.size(); i > 0 ; i--) {
                TreeNode node = queue.removeLast();
                list.add(node.val);

                if (node.right != null) queue.addFirst(node.right);
                if (node.left != null) queue.addFirst(node.left);
            }
            result.add(list);
        }
        return result;
    }
}
