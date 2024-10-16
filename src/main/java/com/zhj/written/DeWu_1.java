package com.zhj.written;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月09日 20:16
 */
public class DeWu_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        int res=0;
        String s;
        s=in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i)-'A'+65);
        }
        for(int i=65;i<=90;i++)
        {
            if(set.contains(i))
                continue;
            res+=i;
        }
        System.out.println(res);
    }
}
