package com.zhj.two_pointer;

import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月30日 13:28
 */
public class CompareVersion {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String version1,version2;
        version1=in.next();
        version2=in.next();
        System.out.println(CompareVersion.compareVersion(version1,version2));
    }
    public static int compareVersion(String version1, String version2) {
           String[] str1=version1.split("\\.");
           String[] str2=version2.split("\\.");
           int[] arr1=new int[Math.max(str1.length,str2.length)];
           int[] arr2=new int[Math.max(str1.length,str2.length)];
           for(int i=0;i<str1.length;i++)
                arr1[i]=Integer.parseInt(str1[i]);
           for(int i=0;i<str2.length;i++)
                arr2[i]=Integer.parseInt(str2[i]);
           for(int i = 0; i< arr2.length; i++)
           {
               if(arr1[i]==arr2[i]) continue;
               else if(arr1[i]<arr2[i]) return -1;
               else return 1;
           }
           return 0;
    }
}
