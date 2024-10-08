package com.zhj.written;

import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月28日 9:25
 */
public class JD_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int flag=1;
        long l=Long.MIN_VALUE,r=Long.MAX_VALUE,Q,M,D,l1,r1;
        Q=in.nextInt();
        for(int i=0;i<Q;i++)
        {
            M=in.nextInt();
            D=in.nextInt();
            l1=-D+M;r1=D+M;
            if(r1<l)
            {
                flag=0;
                break;
            }
            l=Math.max(l1,l);
            r=Math.min(r1,r);
        }
        if(flag==1)
        {
            System.out.println(r);
        }
        else
            System.out.println(-1);
    }
}
