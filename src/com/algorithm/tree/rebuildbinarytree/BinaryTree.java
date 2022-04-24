package com.algorithm.tree.rebuildbinarytree;

import com.algorithm.tree.treetraversal.inorder.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-22 09:15
 * @Description: 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * <p>
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class BinaryTree {

    private Map<Integer, Integer> map;
    int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.preorder = preorder;
        map = new HashMap<>();
        //将前序遍历数据的值与索引存进hash中，方便查找
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(0, 0, inorder.length - 1);
    }

    public TreeNode build(int root, int left, int right) {
        if (left > right) {
            return null;
        }

        //建立树，设置根节点
        TreeNode tree = new TreeNode(preorder[root]);
        //得到在中序遍历中该节点值的索引
        Integer i = map.get(preorder[root]);

        tree.left = build(root + 1, left, i - 1);
        tree.right = build(root + i - left + 1, i + 1, right);

        return tree;
    }
}
