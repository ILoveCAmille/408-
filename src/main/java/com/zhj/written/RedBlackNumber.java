package com.zhj.written;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月18日 18:06
 */
public class RedBlackNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String s2;
        n=in.nextInt();
        List<Long> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(in.nextLong());
        }
        s2=in.nextLine();
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(s2.charAt(i)=='R')
            {
                for(int j=i+1;j<n;j++)
                {
                    if(s2.charAt(j)=='B')
                    {
                        sum+=arr.get(i)*arr.get(j);
                        if(sum>=(1000000000+7))
                        {
                            sum=sum%(1000000000+7);
                        }
                    }
                }
            }
            else {
                for(int j=i+1;j<n;j++)
                {
                    if(s2.charAt(j)=='R')
                    {
                        sum+=arr.get(i)*arr.get(j);
                        if(sum>=(1000000000+7))
                        {
                            sum=sum%(1000000000+7);
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
