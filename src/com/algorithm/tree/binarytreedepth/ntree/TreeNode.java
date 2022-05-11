package com.algorithm.tree.binarytreedepth.ntree;

import java.util.List;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-05-11 10:30
 * @Description:
 */
public class TreeNode {
    int val;
    List<TreeNode> children;

    public TreeNode(){}

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val, List<TreeNode> children){
        this.val = val;
        this.children = children;
    }
}
