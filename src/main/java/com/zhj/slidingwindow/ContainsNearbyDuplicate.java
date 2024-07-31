package com.zhj.slidingwindow;

import com.zhj.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月31日 9:58
 *
代码
测试用例
测试结果
测试结果
219. 存在重复元素 II
简单
相关标签
相关企业
给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。



示例 1：

输入：nums = [1,2,3,1], k = 3
输出：true
示例 2：

输入：nums = [1,0,1,1], k = 1
输出：true
示例 3：

输入：nums = [1,2,3,1,2,3], k = 2
输出：false

 */
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int k;
        k=in.nextInt();
        String[] s1=s.split(",");
        int[] nums = new int[s1.length];
        for(int i=0;i<s1.length;i++)
            nums[i]= Integer.parseInt(s1[i]);
        System.out.println(ContainsNearbyDuplicate.containsNearbyDuplicate(nums,k));

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0,j=0;
        Map<Integer,Integer> cnt=new HashMap<>();
        while(j<nums.length)
        {
            while(Math.abs(j-i)<=k&&j<nums.length) {
                cnt.put(nums[j],cnt.getOrDefault(nums[j],0)+1);
                if(cnt.getOrDefault(nums[j],0)>=2) return true;
                j++;}
            cnt.put(nums[i],0);i++;
        }
        return false;
    }
}
