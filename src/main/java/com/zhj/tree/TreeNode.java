package com.zhj.tree;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 11:44
 */
public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
