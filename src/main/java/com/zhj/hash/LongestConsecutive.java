package com.zhj.hash;

import java.util.HashSet;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月02日 9:55
 */
public class LongestConsecutive {
    public static void main(String[] args){
        int[] nums=new int[]{9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.println(LongestConsecutive.longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int curNum=0,curlength=1,max=0;
        for (int num : nums) {
            set.add(num);
        }
        for (Integer integer : set) {
            if(!set.contains(integer-1))
            {curNum=integer;
             curlength=1;
                while(set.contains(curNum+1))
                {
                    curlength++;curNum++;
                }
            }
            max=Math.max(max,curlength);
        }
        return max;
    }
}
