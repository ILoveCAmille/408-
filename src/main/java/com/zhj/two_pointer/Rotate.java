package com.zhj.two_pointer;

import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月30日 12:47
 */
public class Rotate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String inputStr = in.nextLine();
        String[] strArray = inputStr.split(",");
        int[] nums=new int[strArray.length];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = Integer.parseInt(strArray[i]);
        }
        int k,i=0;
        k=in.nextInt();
        Rotate.rotate(nums,k);
        for (int num : nums) {
            System.out.println(num+" ");
        }

    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0) return;
        int[] arr=new int[k];
        int[] arr1=new int[nums.length-k];
        for(int i=nums.length-k,j=0;i<nums.length;i++,j++)
        arr[j]=nums[i];
        for(int i=0;i<nums.length-k;i++)
            arr1[i]=nums[i];
        for(int i=k;i<nums.length;i++) nums[i]=arr1[i-k];
        System.arraycopy(arr, 0, nums, 0, k);
    }
}
