package com.zhj.Recursion;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月08日 9:44
 * 50. Pow(x, n)
 * 中等
 * 相关标签
 * 相关企业
 * 实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 * 示例 2：
 *
 * 输入：x = 2.10000, n = 3
 * 输出：9.26100
 * 示例 3：
 *
 * 输入：x = 2.00000, n = -2
 * 输出：0.25000
 * 解释：2-2 = 1/22 = 1/4 = 0.25
 */
public class MyPow {
    public double myPow(double x, int n) {
        long N=n;
        return N>=0?quickMul(x,N):1.0/quickMul(x,-N);
    }
    public double quickMul(double x,long N)
    {
        if(N==0) return 1.0;
        double y=quickMul(x,N/2);
        return N%2==0?y*y:y*y*x;
    }
}
