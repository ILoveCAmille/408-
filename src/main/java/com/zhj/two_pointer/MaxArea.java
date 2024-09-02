package com.zhj.two_pointer;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月02日 10:40
 * 11. 盛最多水的容器
 * 已解答
 * 中等
 * 相关标签
 * 相关企业
 * 提示
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 */
public class MaxArea
{
    public int maxArea(int[] height) {
        if(height.length<=1) return 0;
        int i=0,j=height.length-1,max=Math.min(height[i],height[j])*(j-i);
        while(i<j)
        {
            if(height[i]<height[j])
            {
                i++;
                max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            }
            else {
                j--;
                max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            }
        }
        return max;
    }
}
