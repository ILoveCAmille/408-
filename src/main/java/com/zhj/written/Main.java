package com.zhj.written;

import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月27日 16:09
 */
public class Main {
    public static void main(String[] args){
        int n,m;
        double tmp,sum;
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt())
        {
            n=in.nextInt();
            m=in.nextInt();
            sum=n;
            tmp=n;
            for(int i=0;i<m-1;i++)
            {   tmp=Math.pow(tmp,0.5);
                sum+=tmp;
            }
            System.out.printf("%.2f",sum);
        }
    }
}
