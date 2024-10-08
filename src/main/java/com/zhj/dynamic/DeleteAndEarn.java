package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月08日 17:21
 */
public class DeleteAndEarn {
    public static void main(String[] args)
    {   int[] nums={3,4,2};
        System.out.println(deleteAndEarn(nums));
    }
    public static int deleteAndEarn(int[] nums) {
        int maxValue=0;
        for (int num : nums) {
            maxValue=Math.max(maxValue,num);
        }
        int[] sum=new int[maxValue+1];
        for (int num : nums) {
            sum[num]+=num;
        }
        int[] dp=new int[3];
        dp[0]=sum[0];
        dp[1]=sum[1];
        for(int i=2;i<sum.length;i++)
        {
            dp[i % 3] = Math.max(sum[i] + dp[(i - 2) % 3], dp[(i - 1)%3]);
        }
        return dp[(sum.length-1)%3];
    }
}
