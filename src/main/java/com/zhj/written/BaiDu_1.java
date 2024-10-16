package com.zhj.written;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月15日 18:52
 */
public class BaiDu_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T,n,k;
        T=in.nextInt();
        for(int y=0;y<T;y++)
        {
            n=in.nextInt();
            k=in.nextInt();
            int[] nums=new int[n];
            for(int j=0;j<n;j++)
                nums[j]=1;
            int max=maxPoint(nums);
            if(max<=k&&max<=n-k+1)
                System.out.println(max);
            else
            {
                if(k<n-k)
                    System.out.println(k);
                else
                    System.out.println(n-k);
            }
        }
    }
    public static int maxPoint(int[] nums)
    {
        int[] dp=new int[3];
        if(nums==null||nums.length==0)
            return 0;
        else if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]+dp[(i-2)%3]>dp[(i-1)%3])
                dp[i%3]=nums[i]+dp[(i-2)%3];
            else dp[i%3]=dp[(i-1)%3];
        }
        return dp[(nums.length-1)%3];
    }
}
