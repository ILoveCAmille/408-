package com.zhj.search.binarysearch;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月20日 10:56
 * 33. 搜索旋转排序数组
 * 中等
 * 相关标签
 * 相关企业
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 *
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 *
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 *
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 */
public class Search {
    public static void main(String[] args){
        int[] nums=new int[]{3,1};
        int target=1;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[n];
        int left=0,right=n-1,mid;
        mid=(right-left)/2+left;
        while(left<right)
        {   mid=(right-left)/2+left;
            if((mid+1)<=n-1&&nums[mid]>nums[mid+1])
            {
                break;
            }
            else{
                left=mid+1;
            }
        }
        if(target>=nums[0]&&target<=nums[mid])
        {
            left=0;
            right=mid;
            mid=(right-left+1)/2+left;
            while(left<=right)
            {
                if(target==nums[mid])
                {
                    return mid;
                } else if (target<nums[mid]) {
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }
                mid=(right-left+1)/2+left;
            }
        }
        else {
            left=mid+1;
            right=n-1;
            mid=(right-left+1)/2+left;
            while(left<=right)
            {
                if(target==nums[mid])
                {
                    return mid;
                } else if (target<nums[mid]) {
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }
                mid=(right-left+1)/2+left;
            }
        }
        return -1;
    }
}
