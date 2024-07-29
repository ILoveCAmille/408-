package com.zhj.queue;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月29日 10:49
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
