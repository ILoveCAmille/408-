package com.zhj.array;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月07日 13:09
 * 238. 除自身以外数组的乘积
 * 中等
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 *
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题
 */
public class ProductExceptSelf {
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n],right=new int[n],res=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++)
        {
            res[i]=left[i]*right[i];
        }
        return res;
    }
}