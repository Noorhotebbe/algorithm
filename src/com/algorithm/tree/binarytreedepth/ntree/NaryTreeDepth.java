package com.algorithm.tree.binarytreedepth.ntree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-11 10:27
 * @Description: n叉树的深度
 */
public class NaryTreeDepth {
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;
        int depth = 0;

        /*for (TreeNode node : root.children) {
            depth = Math.max(depth, maxDepth(root.children.get(i)));
        }

        return depth + 1;*/

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;

            while (size > 0) {
                TreeNode node = queue.poll();
                for (TreeNode n : node.children) {
                    if (n != null){
                        queue.offer(n);
                    }
                }
                size--;
            }
        }

        return depth;
    }
}
