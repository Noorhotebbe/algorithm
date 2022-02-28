package com.algorithm.treetraversal;

import java.util.TreeMap;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-26 17:08
 * @Description:
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){}

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val,TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
