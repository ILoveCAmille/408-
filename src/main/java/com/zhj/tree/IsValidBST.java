package com.zhj.tree;

import java.util.Stack;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月10日 12:52
 * 98. 验证二叉搜索树
 * 中等
 * 相关标签
 * 相关企业
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左
 * 子树
 * 只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 */
public class IsValidBST {
    Stack<TreeNode> stack=new Stack<>();
    public boolean isValidBST(TreeNode root) {
        return traverse(root);
    }

    private boolean traverse(TreeNode root) {
        if(root==null) return true;
        boolean left=traverse(root.left);
        if(stack.size()==0)
            stack.push(root);
        else{
            if(stack.peek().val>=root.val)
                return false;
            else
                stack.push(root);
        }
        boolean right=traverse(root.right);
        return right&&left;
    }
}
