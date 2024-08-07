package com.zhj.tree;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 15:49
 * /**
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode() {}
 *  *     TreeNode(int val) { this.val = val; }
 *  *     TreeNode(int val, TreeNode left, TreeNode right) {
 *  *         this.val = val;
 *  *         this.left = left;
 *  *         this.right = right;
 *  *     }
 *  * }
 *  */

/*代码
        测试用例
        测试结果
        测试结果
        543. 二叉树的直径
        简单
        相关标签
        相关企业
        给你一棵二叉树的根节点，返回该树的 直径 。

        二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。

        两节点之间路径的 长度 由它们之间边数表示。
 */
public class DiameterOfBinaryTree {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        depth(root);
        return ans-1;
    }

    private int depth(TreeNode root) {
        if(root==null) return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        ans=Math.max(ans,l+r+1);
        return Math.max(l,r)+1;
    }

}
