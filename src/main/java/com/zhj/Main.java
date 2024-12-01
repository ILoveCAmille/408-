package com.zhj;


import com.zhj.dynamic.MaxProfit;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static List<Character> res = new ArrayList<>();
    public static void main(String[] args) {
        //"abcdefg","abcxyz"
        String str1="abcdefg";
        String str2="abcxyz";
        System.out.println(findLongestCommonSubstring(str1,str2));
    }
   /* public static String reverse(String s) {
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            res.add(s.charAt(i));
        }
        Collections.reverse(res);
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            tmp.append(res.get(i));
        }
        return tmp.toString();
    }*/

    /*public static int findMissingElement (int[] nums) {
        // write code here
        int n=nums.length-1,res=0;
        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for(int i=0;i<=n;i++){
            if(!set.contains(i))
            {
                res=i;
                break;
            }
        }
        return res;
    }*/

    public static String findLongestCommonSubstring (String str1, String str2) {
        //最长公共子串，暴力法O（n3）
        String str11;
        String str22;
        if(str1.length()>str2.length())
        {
            str11=str1;
            str22=str2;
        }
        else{
            str11=str2;
            str22=str1;
        }
        // write code here
        int longer,shorter,max=0,res=0;
        StringBuilder resString=new StringBuilder();
        StringBuilder maxString=new StringBuilder();
        longer=Math.max(str1.length(), str2.length());
        shorter=Math.min(str1.length(), str2.length());
        for(int i=0;i<longer;i++)
        {
            for(int j=0;j<shorter;j++)
            {   int left,right;
                left=j;
                right=left;
                while(right<shorter){
                    if(str11.charAt(i)==str22.charAt(right)){
                        max++;maxString.append(str11.charAt(i));
                        i++;right++;
                    }
                    else {
                        i=i-(right-left);
                        break;
                    }
                }
                if(max>res){
                    res=max;
                    resString.delete(0,res-1);
                    resString.append(maxString);
                    maxString.delete(0,max-1);
                    max=0;
                }
            }
        }


        return resString.toString();
    }
}