package com.zhj.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月10日 15:17
 * 114. 二叉树展开为链表
 * 中等
 * 相关标签
 * 相关企业
 * 提示
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 */
public class Flatten {
    Queue<TreeNode> queue=new ArrayDeque<>();
    public void flatten(TreeNode root) {
        if(root==null) return;
        Traverse(root);
        TreeNode tmp;
        while(!queue.isEmpty())
        {
            queue.peek().left=null;
            tmp=queue.poll();
            tmp.right=queue.peek();
        }
    }

    private void Traverse(TreeNode root) {
        if(root==null) return;
        queue.offer(root);
        Traverse(root.left);
        Traverse(root.right);
    }
}
