package com.zhj.tree;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月11日 10:38
 * 437. 路径总和 III
 * 中等
 * 相关标签
 * 相关企业
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 *
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 */
public class PathSum {
    public int pathSum(TreeNode root, long targetSum) {
        if(root==null) return 0;
        int res=rootSum(root,targetSum);
        res+=pathSum(root.left,targetSum);
        res+=pathSum(root.right,targetSum);
        return res;
    }

    private int rootSum(TreeNode root, long targetSum) {
        int ret=0;
        if(root==null) return 0;
        long val=root.val;
        if(val==targetSum)
            ret++;
        ret+=rootSum(root.left,targetSum-val);
        ret+=rootSum(root.right,targetSum-val);
        return ret;
    }
}
