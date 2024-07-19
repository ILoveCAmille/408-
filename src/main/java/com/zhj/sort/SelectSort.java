package com.zhj.sort;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月19日 9:19
 */
public class SelectSort {
        public static void selectionSort(int[] arr){
            int len=arr.length,tmp;
            for(int i=0;i<len-1;i++)
            {
                int min=i;
                for(int j=i+1;j<len;j++){
                    if(arr[min]>arr[j])
                    {
                        min=j;
                    }
                }
                if(min!=i)
                {
                    tmp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=tmp;
                }
            }
        }

}
