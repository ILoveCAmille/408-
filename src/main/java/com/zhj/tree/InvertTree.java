package com.zhj.tree;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月10日 12:07
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode tmp =root.left;
        root.left=root.right;
        root.right=tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
