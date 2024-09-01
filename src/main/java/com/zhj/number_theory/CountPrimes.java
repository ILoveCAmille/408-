package com.zhj.number_theory;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月01日 10:59
 */
public class CountPrimes {
//    public static void  main(String[] args)
//    {
//        System.out.println(CountPrimes.countPrimes(100));
//    }
//    public static int countPrimes(int n) {
//        int count=0,flag=1;
//        for(int i=2;i<n;i++)
//        {   flag=1;
//            for(int j=2;j*j<=i;j++)
//            {
//                if(i%j==0) {flag=0;break;}
//            }
//           if(flag==1) count++;
//        }
//        return  count;
//    }
public int countPrimes(int n) {
   int[] isPrimes=new int[n];
   int count=0;
    Arrays.fill(isPrimes,1);
   for(int i=2;i<n;i++)
   {
       if(isPrimes[i]==1) {
           count++;
           if((long)i*i<n)
           {
               for(int j=i*i;j<n;j+=i)
               {
                   isPrimes[j]=0;
               }
           }
       }
   }
   return count;
}
}
