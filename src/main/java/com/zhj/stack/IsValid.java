package com.zhj.stack;

import java.util.Stack;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月26日 7:33
 */
public class IsValid {
    public static void main(String[] args){
        String s= "(]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        char[] s2=s.toCharArray();
        for (char c : s2) {
            if(c=='('||c=='['||c=='{')
                s1.push(c);
            else if(s1.isEmpty())
                return false;
            else {
                if(c==')') if(s1.pop()=='(') continue;else return false;
                if(c=='}') if(s1.pop()=='{') continue;else return false;
                if(c==']') if(s1.pop()=='[') continue;else return false;
            }
        }
        if(s1.isEmpty())
         return true;
         else return  false;
    }
}
