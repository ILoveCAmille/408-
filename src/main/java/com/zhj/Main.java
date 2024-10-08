package com.zhj;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {   StringBuilder tmp=new StringBuilder();
            tmp.delete(0,tmp.length());
            //拼接英文字符
            if(Character.isLetter(s.charAt(i)))
            {
                while(i<s.length()&&Character.isLetter(s.charAt(i)))
                {
                    tmp.append(s.charAt(i));i++;
                }
                list.add(tmp.toString());
            }
            //拼接数字
            else if (Character.isDigit(s.charAt(i))) {
                while(i<s.length()&&Character.isLetter(s.charAt(i)))
                {
                    tmp.append(s.charAt(i));i++;
                }
                list.add(tmp.toString());
            }
            else{
                while(i<s.length()&&!Character.isLetterOrDigit(s.charAt(i)))
                {
                    tmp.append(s.charAt(i));i++;
                }
                list.add(tmp.toString());
            }
        }
        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}