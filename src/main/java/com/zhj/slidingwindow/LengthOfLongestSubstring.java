package com.zhj.slidingwindow;

import java.util.HashSet;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月04日 11:04
 * 3. 无重复字符的最长子串
 * 已解答
 * 中等
 * 相关标签
 * 相关企业
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长
 * 子串
 *  的长度
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args){
        String s="pwwkew";
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        //滑动窗口
        HashSet<Character> set=new HashSet<>();
        int n=s.length(),max=0,right=0;
        for(int left=0;left<n;left++)
        {
            if(left!=0)
                set.remove(s.charAt(left-1));
            while(right<n&&!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                ++right;
            }
            max=Math.max(max, set.size());
        }
        return max;
    }
}
