package com.zhj.written;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2025年03月08日 20:28
 */
public class mt_test_3 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n;
        n=in.nextInt();
        in.nextLine();
        String s;
        for(int i=0;i<n;i++){
            s=in.nextLine();
            String t;
            Queue<Character> q=new ArrayDeque<>();
            Queue<Character> q1=new ArrayDeque<>();
            for(int j=0;j<s.length();j++){
                if(Character.isDigit(s.charAt(j)))
                {   //左移num
                    int num=Integer.parseInt(String.valueOf(s.charAt(j)));
                    for(int k=0;k<num;k++){
                        q1.offer(q.poll());
                    }
                    for (Character character : q1) {
                        q.offer(character);
                    }
                }
                else if(Objects.equals(s.charAt(j),'R')){
                    Collections.reverse((Arrays.asList(q.toArray())));
                }
                else{
                    q.add(s.charAt(j));
                }
            }
            t="";
            for (Character character : q) {
                t=t+character;
            }
            System.out.println(t);
        }
    }
}
