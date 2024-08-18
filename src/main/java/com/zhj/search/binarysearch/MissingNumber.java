package com.zhj.search.binarysearch;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月18日 13:07
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=0,n=nums.length,r=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i!=nums[i])
                return i;
        }
        return n;
    }
}
