package com.zhj.written;

import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月28日 9:44
 */
public class JD_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,l=0,w=0,h=0,max=0;
        int s1,s2,s3;
        n=in.nextInt();
        m=in.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=in.nextInt();
                max=Math.max(arr[i][j],max);
            }
        }
        l=m;
        h=max;
        w=n;
        //计算正面
        s1=l*h;
        for(int i=0;i<m;i++)
        {   int tmp=0;
            for(int j=0;j<n;j++)
            {
                tmp=Math.max(tmp,arr[j][i]);
            }
            s1=s1-(h-tmp);
        }
        //左面
        s2=w*h;
        for(int i=0;i<n;i++)
        {   int tmp=0;
            for(int j=0;j<m;j++)
            {
                tmp=Math.max(tmp,arr[i][j]);
            }
            s2=s2-(h-tmp);
        }
        //上面
        s3=l*w;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    s3=s3-1;
                }
            }
        }
        System.out.println(s1+" "+s2+" "+s3);
    }
}
