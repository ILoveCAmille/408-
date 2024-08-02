package com.zhj.tree;

import java.util.*;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 14:33
 */
public class LevelOrder {
    List<List<Integer>>  res=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return res;
        Queue<TreeNode> queue =new ArrayDeque<>();
        queue.offer(root);
        int k=1;
        while(queue.peek()!=null){
            List<Integer> tmp=new ArrayList<>();
            int size= queue.size();;
            for(int i=0;i<size;i++)
            {
                tmp.add(queue.peek().val);
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                queue.poll();
            }
            if(k%2==1)
            res.add(tmp);
            else {
                Collections.reverse(tmp);
                res.add(tmp);
            }
            k++;
        }
        return res;
    }
}
