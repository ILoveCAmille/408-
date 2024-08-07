package com.zhj.tree;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 16:19
 */
public class MaxPathSum {
    int ans;
    public int maxPathSum(TreeNode root) {
        ans=Integer.MIN_VALUE;
        depth(root);
        return ans;
    }
    private int depth(TreeNode root) {
        if(root==null) return 0;
        int l=Math.max(depth(root.left),0);
        int r=Math.max(depth(root.right),0);
        ans=Math.max(ans,l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}
