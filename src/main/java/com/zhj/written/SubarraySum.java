package com.zhj.written;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月13日 13:25
 */
public class SubarraySum {
    public static void main(String[] args){
        int[] nums={1,2,3};
        int k=3;
        System.out.println(subarraySum(nums,k));
    }
    static int count=0;
    public static int subarraySum (int[] nums, int k) {
        // write code here
//        backtrack(nums,k,0,0);
//        return count;
        int n = nums.length;
        Arrays.sort(nums);
        for (int first = 0; first < n; first++){
            int sum=0;
            for(int end=first;end<n;end++)
            {
                sum+=nums[end];
                if(sum==k)
                {
                    count++;
                }
            }
        }
        return count;
    }

/*    private void backtrack(int[] nums, int target, int cur,int sum) {
        if(sum==target)
        {
            count++;
            return;
        }
        sum+=nums[cur];
        backtrack(nums,target,cur+1,sum);
        sum-=nums[cur];

    }*/
}
