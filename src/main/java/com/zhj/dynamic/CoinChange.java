package com.zhj.dynamic;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月04日 13:23
 */
public class CoinChange {
    public static void main(String[] args)
    {   int[] coins={186,419,83,408};
        int amount=6249;
        System.out.println(coinChange(coins,amount));
    }
//    public  static int coinChange(int[] coins, int amount) {
//        //从大往小一个一个找
//        int n=coins.length,count=0;
//        Arrays.sort(coins);
//        for(int i=n-1;i>=0;i--)
//        {
//            if(amount>=coins[i])
//            {
//                count+=amount/coins[i];
//                amount=amount%coins[i];
//            }
//            if(amount==0)
//                return count;
//        }
//        if(amount!=0)
//        {
//            return -1;
//        }
//        else
//            return count;
//    }
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
