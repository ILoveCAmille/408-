package com.zhj.hash;

import java.util.HashMap;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月06日 10:59
 */
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count=0,pre=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            pre+=nums[i];
            if(map.containsKey(pre-k))
            {
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }

}
