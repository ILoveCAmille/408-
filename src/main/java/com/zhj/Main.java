package com.zhj;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m,n,tmp,sum;
        Scanner in=new Scanner(System.in);
        List<Integer> res=new ArrayList<>();
        while(in.hasNextInt())
        {
            m=in.nextInt();
            n=in.nextInt();
            for(int i=m;i<=n;i++)
            {   tmp=i;
                sum=0;
                while(tmp!=0)
                {
                    sum+=Math.pow(tmp%10,3);
                    tmp=tmp/10;
                }
                if(sum==i)
                res.add(i);
            }
            if(res.size()==0)
            {
                System.out.println("no");
            }
            else{
                for (Integer re : res) {
                    System.out.printf(re+" ");
                }
                System.out.println();
            }
        }
    }
}