package com.zhj.greedy;

import java.util.HashMap;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月17日 7:48
 * 409. 最长回文串
 * 简单
 * 相关标签
 * 相关企业
 * 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的
 * 回文串
 *  的长度。
 *
 * 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 *
 *
 *
 * 示例 1:
 *
 * 输入:s = "abccccdd"
 * 输出:7
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * 示例 2:
 *
 * 输入:s = "a"
 * 输出:1
 * 解释：可以构造的最长回文串是"a"，它的长度是 1。
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length(),res=0;
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (Character character : map.keySet()) {
            res+=map.get(character)/2*2;
            if(map.get(character)%2==1&&res%2==0)
            {
                res++;
            }
        }
        return res;
        }
    }
