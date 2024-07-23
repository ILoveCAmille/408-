package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月23日 9:13
 *
121. 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int cost=Integer.MAX_VALUE,profit=Integer.MIN_VALUE,t=0;
        for(int i=0;i<prices.length;i++)
        {
            cost =Math.min(cost,prices[i]);
            if(profit<(prices[i]-cost)) {profit=prices[i]-cost;t=i;}
        }
        if(profit<=0)
            return 0;
        else return t+1;
    }
}
