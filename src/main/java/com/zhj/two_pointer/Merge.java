package com.zhj.two_pointer;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月30日 11:20
 */
public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(nums1[i]<=nums2[j]) {arr[k]=nums1[i];i++;k++;}
            else {arr[k]=nums2[j];j++;k++;}
        }
        if(i<m&&m!=0) while(i<m&&m!=0) {arr[k]=nums1[i];i++;k++;}
        if(j<n) while(j<n) {arr[k]=nums2[j];j++;k++;}
        i=0;
        while(i<k) {nums1[i]=arr[i];i++;}
    }
}
