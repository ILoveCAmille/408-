package com.zhj.array;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月07日 11:40
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        //滚动数组
        int n=nums.length,res=nums[0];
        int[] dp=new int[3];
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {
            dp[i%3]=Math.max(nums[i-1],nums[i-1]+dp[(i-1)%3]);
            res=Math.max(res,dp[i%3]);
        }
        return res;
    }
}
