package com.zhj.tips;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月27日 11:30
 * 169. 多数元素
 * 简单
 * 相关标签
 * 相关企业
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
        int res=nums[0],count=1;
        for(int i=1;i<nums.length;i++)
        {   if(res==nums[i])
                count++;
            else
                count--;
            if(count==0)
            {
                res=nums[i];
                count++;
            }
        }
        return res;
    }
}
