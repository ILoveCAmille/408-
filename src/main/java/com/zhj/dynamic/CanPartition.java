package com.zhj.dynamic;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月24日 11:26
 */
public class CanPartition {
   /* public static boolean canPartition(int[] nums) {
        boolean flag=false;
        if(nums==null||nums.length==0||nums.length==1)
            return flag;
        int sum=Arrays.stream(nums).sum();
        int sum1=0,t=0,i,j;
        if(sum%2!=0) return flag;
        nums=Arrays.stream(nums).sorted().toArray();
        if(nums.length%2==0){ i=(nums.length-1)/2;j=(nums.length)/2;}
        else { i=(nums.length-1)/2;j=(nums.length)/2+1;}
        while (i>=0&&j<nums.length) {
        if(sum1==sum/2) {flag=true;break;}
        if(t==0) {sum1=sum1+nums[i];i--;t=1;}
        else  {sum1=sum1+nums[j];j++;t=0;}
        }
        if(sum1==sum/2) {flag=true;}
        return flag;
        消愁写法
    }*/

    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            for (int j = target; j >= num; --j) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];

    }
}
