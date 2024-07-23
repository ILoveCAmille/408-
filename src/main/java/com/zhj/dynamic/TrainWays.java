package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月23日 10:07
 */
public class TrainWays {
    public static int trainWays(int num) {
        int[] dp=new int[3];
        dp[0]=1;dp[1]=2;
        for(int i=2;i<num;i++) {
            if (dp[(i - 1) % 3] + dp[(i - 2) % 3] > 1000000007) {
                dp[i % 3] = (dp[(i - 1) % 3] + dp[(i - 2) % 3]) % 1000000007;
            }
            else dp[i%3]=dp[(i - 1) % 3] + dp[(i - 2) % 3];
        }
        if(num==0) return dp[0];
        return dp[(num-1)%3]%1000000007;
    }
}
