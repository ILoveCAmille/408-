package com.zhj.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月03日 11:48
 * 15. 三数之和
 * 已解答
 * 中等
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {
    public static void main(String[] args){
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        ThreeSum.threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int k=n-1;
            int target=-nums[i];
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                while(j<k&&nums[j]+nums[k]>target) --k;
                if(j==k) break;
                if(nums[j]+nums[k]==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
