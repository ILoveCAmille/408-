package com.zhj.number_theory;

import java.util.PriorityQueue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月01日 11:35
 * 1492. n 的第 k 个因子
 * 中等
 * 相关标签
 * 相关企业
 * 提示
 * 给你两个正整数 n 和 k 。
 *
 * 如果正整数 i 满足 n % i == 0 ，那么我们就说正整数 i 是整数 n 的因子。
 *
 * 考虑整数 n 的所有因子，将它们 升序排列 。请你返回第 k 个因子。如果 n 的因子数少于 k ，请你返回 -1 。
 */
public class KthFactor {

    public int kthFactor(int n, int k) {
        PriorityQueue<Integer> factors=new PriorityQueue<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0) {factors.offer(i);factors.offer(n/i);}
            if(i*i==n)
                factors.remove(i);
        }
        for(int i=0;i<k-1;i++)
            factors.poll();
        return factors.isEmpty()?-1:factors.poll();
    }
}
