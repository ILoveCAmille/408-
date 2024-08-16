package com.zhj.search;

import com.zhj.tree.TreeNode;

import java.util.*;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月16日 8:44
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder= new LinkedList<List<Integer>>();
        if(root==null) return levelOrder;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            int size= queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                level.add(node.val);
                TreeNode left=node.left,right=node.right;
                if(left!=null)
                    queue.offer(left);
                if(right!=null)
                    queue.offer(right);
            }
            levelOrder.add(0,level);
        }
        return levelOrder;
    }
}
