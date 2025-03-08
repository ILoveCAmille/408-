package com.zhj;


import com.zhj.dynamic.MaxProfit;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static List<Character> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        Stack<Character> queue=new Stack<>();
        Stack<Integer> stack =new Stack<>();
        long res=0;
        for(int i=0;i<s.length();i++){
            //数字
            if(Character.isDigit(s.charAt(i))){
                stack.push(Integer.valueOf(s.charAt(i)-'0'));
            }
            //加减
            else if (s.charAt(i)=='+'||s.charAt(i)=='-') {
                queue.push(s.charAt(i));
            }
            //*
            else{
                int tmp = stack.pop();
                i++;
                stack.push(tmp*Integer.valueOf(s.charAt(i)-'0'));
            }
        }
        while(!queue.isEmpty()){
            if(queue.pop()=='+'){
                res+=stack.pop();
            }
            else{
                res-=stack.pop();
            }
        }
        if(!stack.isEmpty())
        res+=stack.pop();
        System.out.print(res);
       /* for(int i=0;i<s.length();i++){
            count++;
            if(i!=s.length()-1&&s.charAt(i)!=s.charAt(i+1)){
                res.append(s.charAt(i));
                res.append(count);
                count=0;
            } else if(i==s.length()-1){
                if(s.charAt(i)==s.charAt(i-1)){
                    res.append(s.charAt(i));
                    res.append(count);
                }
                else{
                    res.append(s.charAt(i-1));
                    res.append(count);
                    res.append(s.charAt(i));
                    res.append(1);
                }
            }
        }
        System.out.println(res.toString());*/
        /* HashMap<Character,Integer> res =new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char tmp=s.charAt(i);
            res.put(tmp,res.getOrDefault(tmp,0)+1);
        }
        for (Character character : res.keySet()) {
            System.out.print(character+""+res.get(character));
        }*/
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

//    public static String findLongestCommonSubstring (String str1, String str2) {
//        //最长公共子串，暴力法O（n3）
//        String str11;
//        String str22;
//        if(str1.length()>str2.length())
//        {
//            str11=str1;
//            str22=str2;
//        }
//        else{
//            str11=str2;
//            str22=str1;
//        }
//        // write code here
//        int longer,shorter,max=0,res=0;
//        StringBuilder resString=new StringBuilder();
//        StringBuilder maxString=new StringBuilder();
//        longer=Math.max(str1.length(), str2.length());
//        shorter=Math.min(str1.length(), str2.length());
//        for(int i=0;i<longer;i++)
//        {
//            for(int j=0;j<shorter;j++)
//            {   int left,right;
//                left=j;
//                right=left;
//                while(right<shorter){
//                    if(str11.charAt(i)==str22.charAt(right)){
//                        max++;maxString.append(str11.charAt(i));
//                        i++;right++;
//                    }
//                    else {
//                        i=i-(right-left);
//                        break;
//                    }
//                }
//                if(max>res){
//                    res=max;
//                    resString.delete(0,res-1);
//                    resString.append(maxString);
//                    maxString.delete(0,max-1);
//                    max=0;
//                }
//            }
//        }
//
//
//        return resString.toString();
//    }
}