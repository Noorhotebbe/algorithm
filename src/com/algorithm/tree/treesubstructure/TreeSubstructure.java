package com.algorithm.tree.treesubstructure;

import com.algorithm.tree.treetraversal.inorder.TreeNode;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-06 09:48
 * @Description: 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * <p>
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 */
public class TreeSubstructure {
    public boolean isSubstructure(TreeNode parent, TreeNode son){

        if (parent == null || son == null) return false;

        //判断子树的值与结构是否与父树一致，有一方一致则返回true
        return check(parent, son) || isSubstructure(parent.left, son) || isSubstructure(parent.right, son);

    }

    public boolean check(TreeNode parent, TreeNode son){

        if (son == null) return true;
        if (parent == null || parent.val != son.val) return false;

        return check(parent.left, son.left) && check(parent.right, son.right);
    }
}
