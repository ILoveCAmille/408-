package com.zhj.tree;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月10日 12:26
 */
public class SortedArrayToBST {
    public static void main(String[] args){
        int[] nums={-10,-3,0,5,9};
        sortedArrayToBST(nums);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return  create(nums,0,nums.length-1);
    }

    private static TreeNode create(int[] nums, int left, int right) {
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=create(nums,left,mid-1);
        root.right=create(nums,mid+1,right);
        return root;
    }
}
