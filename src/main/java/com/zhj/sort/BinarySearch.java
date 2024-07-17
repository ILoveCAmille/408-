package com.zhj.sort;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月16日 17:36
 */
public class BinarySearch {

    //传进来的数组必须是有序的，这样才有意义
    public static boolean binarySearch(int nums[],int size,int target){
            int left=0;
            int right=size-1;
            int mid=left+((right-left)/2);
            while(left<=right){
                mid=left+((right-left)/2);
                if(nums[mid]>target)//如果目标小于中间的数，那么目标在左区间
                {
                    right=mid-1;//因为确定mid不等于target所以mid不再使用所以-1
                }
                else if (nums[mid]<target)//同理目标在右边区间
                {
                    left=mid+1;//同理mid不再使用
                }
                else{
                    return true;
                }
            }
            return false;
    }

}
