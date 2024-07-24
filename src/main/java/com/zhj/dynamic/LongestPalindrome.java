package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月24日 9:41
 *
 * 给你一个字符串 s，找到 s 中最长的
 * 回文
 *
 * 子串
 * 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
            int len=s.length(),len3=0,start=0,end=0;
            if(s==null||s.length()==0)
                return "";
            for(int i=0;i<len;i++)
            {
                //遍历回文中心
                int len1=longCenter(s,i,i);
                int len2=longCenter(s,i,i+1);
                len3=Math.max(len1,len2);
                if(len3>end-start)
                {
                    start=i-(len3-1)/2;
                    end=i+len3/2;
                }

            }
            return s.substring(start,end+1);
    }

    private static int longCenter(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;right++;
        }
        return right-left-1;
    }
}
