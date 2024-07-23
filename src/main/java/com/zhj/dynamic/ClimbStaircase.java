package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月22日 10:27
 */
/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？典型的动态规划和斐波那契数列，主要是求出递推方程F(n)=F(n-1)+F(n-2)
初始化f1=1；f2=2；f3=3，，f4=5
* */
public class ClimbStaircase {

    //这里使用滚动数组效率最高，内存占用最少
    public static int climbStairs(int n) {
        int[] dp=new int[3];
        dp[0]=1;dp[1]=2;
        for(int i=2;i<n;i++)
            dp[i%3]=dp[(i-1)%3]+dp[(i-2)%3];
        if(n==1) return dp[0];
        if(n==2) return dp[1];
        return dp[(n-1)%3];
    }
}
