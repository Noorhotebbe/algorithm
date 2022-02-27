package com.algorithm.treetraversal;

import java.util.TreeMap;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-26 17:08
 * @Description:
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val,TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
