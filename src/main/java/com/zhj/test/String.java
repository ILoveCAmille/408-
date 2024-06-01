package com.zhj.test;

import java.util.LinkedHashMap;

public class String {
    private char[] replace(java.lang.String str){
        char ar[]=str.toCharArray();
        int len= ar.length,blank=0,i;
        for(char ch:ar){
            if(ch==' ') blank++;
        }
        len=len+blank*2;
        char ar1[]=new char[len];
        for(i=0;i<len-blank*2;i++){
            if(ar[i]==' ')
            {
                ar1[i]=%;i++;
                ar1[i]=2;i++;
                ar1[i]=0;i++;
            }
            else{
                ar1[i]=ar[i];i++;
            }
        }
       return ar1;
    }

    private char[] FirstNorepeated(java.lang.String str){
        LinkedHashMap hashMap=new LinkedHashMap<>();

    }

}
