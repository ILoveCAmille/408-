package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月22日 11:17
 */
public class Tribonacci {
    //斐波那契数列类似，初始化，递推，滚动数组
    public static int tib(int n) {
        int[] dp=new int[4];
        dp[0]=0;dp[1]=1;dp[2]=1;
        for(int i=3;i<=n;i++)
            dp[i%4]=dp[(i-1)%4]+dp[(i-2)%4]+dp[(i-3)%4];
        return dp[n%4];
    }
}
