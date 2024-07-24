package com.zhj.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月24日 13:31
 */
public class TwoSum {
    public static int[] twoSum1(int[] nums, int target) {
        int t=0,m=0,n=0,flag=0;
        int[] tmp=new int[2];
        for(int i=0;i<nums.length;i++)
        {   t=target-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(t==nums[j]) {m=i;n=j;flag=1;break;}
            }
           if(flag==1) break;
        }
        tmp[0]=m;tmp[1]=n;
        return tmp;
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashtable=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hashtable.containsKey(target-nums[i]))
                return new int[]{hashtable.get(target-nums[i]),i};
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}
