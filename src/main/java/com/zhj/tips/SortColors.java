package com.zhj.tips;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月27日 11:58
 * 75. 颜色分类
 * 中等
 * 相关标签
 * 相关企业
 * 提示
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地 对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 */
public class SortColors {
    public static void main(String[] args){
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
        for (int num : nums) {
            System.out.printf(num+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int p0=0,p1=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {   swap(i,p0,nums);
                if(p0<p1)
                {
                    swap(i,p1,nums);
                }
                p0++;
                p1++;
            } else if (nums[i]==1) {
                swap(i,p1,nums);
                p1++;
            }
        }

    }
    public static void swap(int i,int j,int[] nums)
    {
        int tmp;
        tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
