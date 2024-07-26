package com.zhj.stack;

import java.util.Stack;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月26日 9:22
 */
public class RemoveKdigits {
    public static void main(String[] args){
        String num="112";
        System.out.println(removeKdigits(num,1));
    }
    public static String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        int count=0;
        char[] ch=num.toCharArray();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
          if(s.isEmpty()) {s.push(ch[i]);continue;}
          if(count==k) {for(int j=i;j<num.length();j++) s.push(ch[j]);break;}
          if(s.peek()>=ch[i]) {s.pop();count++;s.push(ch[i]);continue;}
          if(s.peek()<ch[i]&&s.size()<num.length()-k) {s.push(ch[i]);continue;}
          if(s.peek()<ch[i]&&s.size()==num.length()-k) continue;
        }
        Stack<Character> s1=new Stack<>();
        while(!s.isEmpty())
        {
            s1.push(s.pop());
        }
        int i=0;
        while(!s1.isEmpty())
        {   if(s1.peek()=='0') {s1.pop();continue;}
            else break;
        }
        while(!s1.isEmpty()) {ch[i]=s1.pop();i++;}
        num=String.valueOf(ch);
        num=num.substring(0,i);
        return num.length()==0?"0":num;
    }
}
