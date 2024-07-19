package com.zhj.sort;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月19日 15:45
 */
public class MSDSort {
    //基数排序
    public static int[] mSDSort(int[] arr){
        //int 32位  16位的大小为65536所以k为65536
        final int k=65536;
        int[] cnt=new int[k];
        int[] tmp=new int[arr.length];
        Arrays.fill(cnt,0);
        for(int i=0;i<arr.length;i++) cnt[arr[i]%k]++;//找出0-65535中每个数的数量
        for(int i=1;i<k;i++) cnt[i]=cnt[i]+cnt[i-1];//统计前缀和
        for(int i=arr.length-1;i>=0;i--) tmp[--cnt[arr[i]%k]]=arr[i];
        arr=Arrays.copyOf(tmp,tmp.length);
        Arrays.fill(cnt,0);
        for(int i=0;i<arr.length;i++) cnt[arr[i]/k]++;
        for(int i=1;i<k;i++) cnt[i]=cnt[i]+cnt[i-1];
        for(int i=arr.length-1;i>=0;i--) tmp[--cnt[arr[i]/k]]=arr[i];
        arr=Arrays.copyOf(tmp,tmp.length);
        return arr;
    }
}
