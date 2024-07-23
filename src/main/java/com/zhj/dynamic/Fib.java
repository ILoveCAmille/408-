package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月22日 11:02
 */
//斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
public class Fib {
    public static int fib(int n) {
        int[] dp=new int[3];
        if(n==0) return 0;
        if(n==1) return 1;
        dp[0]=0;dp[1]=1;
        for(int i=2;i<=n;i++)
            dp[i%3]=dp[(i-1)%3]+dp[(i-2)%3];
        return dp[n%3];
    }
}
