package com.zhj.dynamic;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月22日 11:33
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int m=s.length(),n=t.length(),i=0,j=0;
        while(i<m&&j<n){
         if(s.charAt(i)==t.charAt(j))
         {
             i++;
         }
         j++;
        }
        return i==m;
    }


}
