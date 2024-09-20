package com.zhj.search.binarysearch;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月19日 10:44
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1,mid;
        int[] res=new int[2];
        mid=(right-left+1)/2+left;
        while(left<=right)
        {
            mid=(right-left+1)/2+left;
            if(nums[mid]==target)
            {
                left=mid;
                right=mid;
                break;
            } else if (nums[mid]<target) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        if(left!=right)
            return new int[]{-1,-1};
        while(left>=0)
        {
            left--;
            if(left>=0&&nums[left]!=nums[mid])
                break;
        }
        while(right<= nums.length-1)
        {
            right++;
            if(right<= nums.length-1&&nums[right]!=nums[mid])
                break;
        }
        return new int[]{left+1,right-1};

    }
}
