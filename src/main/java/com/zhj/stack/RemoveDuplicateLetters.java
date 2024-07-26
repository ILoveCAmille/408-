package com.zhj.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月26日 11:04
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int len=s.length();
        int[] indexlast=new int[26];
        for(int i=0;i<s.length();i++)
            indexlast[s.charAt(i)-'a']=i;
        char[] charArray=s.toCharArray();
        Deque<Character> stack=new ArrayDeque<>();
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();i++)
        {   if (visited[charArray[i]-'a']) continue;
            while(!stack.isEmpty()&&stack.peekLast()>charArray[i]&&indexlast[stack.peekLast()-'a']>i){
                char top=stack.removeLast();
                visited[top-'a']=false;
            }
            stack.addLast(charArray[i]);
            visited[charArray[i]-'a']=true;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (Character character : stack) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
