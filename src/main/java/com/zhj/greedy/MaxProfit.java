package com.zhj.greedy;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月17日 8:25
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        for (int i = 1; i < n; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}
