package com.zhj.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月11日 9:28
 */
public class BuildTree {
    public static void main(String[] args){
        int[] pre_order={3,9,20,15,7};
        int[] in_order={9,3,15,20,7};
        buildTree(pre_order,in_order);
        }
    private static Map<Integer, Integer> indexMap;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        indexMap=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            indexMap.put(inorder[i],i);
        }
        return TreeBuilder(preorder,inorder,0,n-1,0,n-1);
    }

    private static TreeNode TreeBuilder(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left,
                                 int in_right) {
        if(pre_left>pre_right) return null;
        int pre_root=pre_left;
        int in_root=indexMap.get(preorder[pre_root]);
        TreeNode root=new TreeNode(preorder[pre_root]);
        int size_left_subtree=in_root-in_left;
        root.left=TreeBuilder(preorder,inorder,pre_left+1,pre_left+size_left_subtree,in_left,in_root-1);
        root.right=TreeBuilder(preorder,inorder,pre_left+size_left_subtree+1,pre_right,in_root+1,in_right);
        return root;
    }
}
