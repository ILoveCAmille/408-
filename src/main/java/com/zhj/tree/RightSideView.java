package com.zhj.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月10日 13:47
 * 199. 二叉树的右视图
 * 中等
 * 相关标签
 * 相关企业
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */
public class RightSideView {
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return res;
        //层序遍历bfs
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size= queue.size();
            while(size>0){
                TreeNode target;
                if(queue.peek().left!=null)
                queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                queue.offer(queue.peek().right);
                target=queue.poll();
                --size;
                if(size==0) res.add(target.val);
            }
        }
        return res;
    }
}
