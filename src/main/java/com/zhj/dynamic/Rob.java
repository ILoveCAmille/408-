package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月24日 10:09
 */
public class Rob {
    public static int rob(int[] nums) {
        int[] dp=new int[3];
        if(nums==null||nums.length==0)
            return 0;
        else if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]+dp[(i-2)%3]>dp[(i-1)%3])
                dp[i%3]=nums[i]+dp[(i-2)%3];
            else dp[i%3]=dp[(i-1)%3];
        }
        return dp[(nums.length-1)%3];
    }
}
