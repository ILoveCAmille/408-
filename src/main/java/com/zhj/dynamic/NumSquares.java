package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月04日 12:16
 * 279. 完全平方数
 * 已解答
 * 中等
 * 相关标签
 * 相关企业
 * 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
 *
 * 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
 */
public class NumSquares {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            dp[i]=i;//每次都用最大值
            for(int j=1;i-j*j>=0;j++)
            {
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);//从小到大一个一个找
            }
        }
        return dp[n];
    }
}
