package com.zhj.search.binarysearch;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月19日 9:12
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0) return 0;
        int left=0,right=nums.length-1;
        int mid=(left+right)/2;
        while(left<right)
        {
            mid=(left+right)/2;
            if(target==nums[mid])
            {
                return mid;
            } else if (target<nums[mid]) {
                right=mid-1;
            } else if (target>nums[mid]) {
                left=mid+1;
            }
        }
        return left;
    }
}
