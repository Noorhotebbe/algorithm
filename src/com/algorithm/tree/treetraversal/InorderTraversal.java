package com.algorithm.tree.treetraversal;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-02-26 16:47
 * @Description:
 *      树的中序遍历
 */
public class InorderTraversal {
    public List<Integer> traversal(TreeNode root){
//        List<Integer> res = new ArrayList<>();
//        inorder(root,res);
//        return res;

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || stack.size()>0){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
//    public void inorder(TreeNode root,List<Integer> res){
//        if (root == null) return;
//        inorder(root.left,res);
//        res.add(root.val);
//        inorder(root.right,res);
//    }

}
