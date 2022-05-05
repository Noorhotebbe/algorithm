package com.algorithm.tree.thekthnode;

import com.algorithm.tree.treetraversal.inorder.TreeNode;


/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-05 13:09
 * @Description: 剑指 Offer 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
 */
public class KthNode {
    private int res = 0, count = 0;

    public int kthLargest(TreeNode root, int k) {

        //遍历数据存入集合
//        List<Integer> res = new ArrayList<>();
//        dsf(root, res);
//        return res.get(k - 1);

        //遍历数据存入维护的变量中，节省了空间
        dsf(root, k);
        return res;
    }

    /**
     * 因为二叉搜索树的中序遍历出来的数据是有序且递增的
     * 所以将中序遍历逆序即可得到递减的数据
     *
     * @param root
     * @param res
     */
    public void dsf(TreeNode root, int k) {

        if (root == null) return;

        if (root.right != null) dsf(root.right, res);

        if (++count == k){
            res = root.val;
        }
        if (root.left != null) dsf(root.left, res);

    }
}
