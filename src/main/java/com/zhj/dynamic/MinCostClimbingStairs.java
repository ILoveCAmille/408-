package com.zhj.dynamic;

import java.util.function.IntToDoubleFunction;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月23日 10:48
 */
public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int len=cost.length;
        int[] minCost=new int[3];
        minCost[0]= cost[0];
        minCost[1]=cost[1];
        for(int i=2;i<len;i++)
        {
            if(minCost[(i-1)%3]<minCost[(i-2)%3]) minCost[i%3]=minCost[(i-1)%3]+cost[i];
            else minCost[i%3]=minCost[(i-2)%3]+cost[i];
        }
        return Math.min(minCost[(len-1)%3],minCost[(len-2)%3]);
    }
}
