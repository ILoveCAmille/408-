package com.zhj.sort;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月19日 9:34
 */
public class InsertionSort {
    public static void insertionsort(int[] arr){
        int tmp,j,len=arr.length;
        for(int i=1;i<len;i++){
            tmp=arr[i];j=i;
            while(j>0&&tmp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=tmp;
        }
    }
}
