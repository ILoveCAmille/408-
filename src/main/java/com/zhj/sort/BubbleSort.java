package com.zhj.sort;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月16日 17:23
 */
public class BubbleSort {
    private  int[] arr={0};

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void BubbleSort(){
        int tmp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1]){
                    tmp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }


}
