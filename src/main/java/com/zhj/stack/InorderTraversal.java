package com.zhj.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月26日 7:57
 */
public class InorderTraversal {

    public static void main(String[] args){

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        return list;
    }
    public static void inOrder(TreeNode root,List<Integer> list){
        if(root==null) return ;

        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}
