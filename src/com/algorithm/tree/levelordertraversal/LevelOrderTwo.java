package com.algorithm.tree.levelordertraversal;

import com.algorithm.tree.treetraversal.inorder.TreeNode;

import java.util.*;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-01 09:17
 * @Description: 二叉树的层序遍历II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */
public class LevelOrderTwo {
    public List<List<Integer>> traverse(TreeNode root) {

        List<List<Integer>> resList = new ArrayList<>();
        levelOrder(root, resList, 0);
        return resList;
    }

    /**
     * 递归解
     *
     * @param node
     * @param list
     * @param depth
     */
    public void levelOrder(TreeNode node, List<List<Integer>> list, int depth) {
        if (node == null) {
            return;
        }
        depth++;

        if (list.size() < depth) {
            List<Integer> nodes = new ArrayList<>();
            list.add(nodes);
        }


        list.get(depth - 1).add(node.val);
        levelOrder(node.left, list, depth);
        levelOrder(node.right, list, depth);
    }

    /**
     * 迭代解
     *
     * @param node
     * @param list
     */
    public void iterateTraverse(TreeNode node, List<List<Integer>> list) {
        if (node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        queue.offer(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode treeNode = queue.poll();
            while (size > 0) {
                arrayList.add(treeNode.val);
                if (treeNode.left != null) queue.offer(treeNode.left);
                if (treeNode.right != null) queue.offer(treeNode.right);
                size--;
            }
            list.add(arrayList);
        }

    }
}
