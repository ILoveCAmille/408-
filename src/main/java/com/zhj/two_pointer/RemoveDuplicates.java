package com.zhj.two_pointer;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月30日 10:10
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int slow=1,fast=1;
        while(fast<nums.length)
        {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            fast++;
        }
    return slow;
    }
}
