package com.zhj.tree;

import java.util.PriorityQueue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 13:31
 */
public class KthSmallest {
    PriorityQueue<Integer> queMin;
    public int kthSmallest(TreeNode root, int k) {
        queMin=new PriorityQueue<>();
        //中序遍历放到优先队列里，有个堆随时可以去第k小
        push(root);
        for(int i=1;i<k;i++)
            queMin.poll();
        return queMin.peek();
    }

    private void push(TreeNode root) {
        if(root==null) return;
        push(root.left);
        queMin.offer(root.val);
        push(root.right);
    }
}
