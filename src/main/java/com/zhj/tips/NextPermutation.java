package com.zhj.tips;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月27日 14:58
 * 31. 下一个排列
 * 中等
 * 相关标签
 * 相关企业
 * 整数数组的一个 排列  就是将其所有成员以序列或线性顺序排列。
 *
 * 例如，arr = [1,2,3] ，以下这些都可以视作 arr 的排列：[1,2,3]、[1,3,2]、[3,1,2]、[2,3,1] 。
 * 整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。更正式地，如果数组的所有排列根据其字典顺序从小到大排列在一个容器中，那么数组的 下一个排列 就是在这个有序容器中排在它后面的那个排列。如果不存在下一个更大的排列，那么这个数组必须重排为字典序最小的排列（即，其元素按升序排列）。
 *
 * 例如，arr = [1,2,3] 的下一个排列是 [1,3,2] 。
 * 类似地，arr = [2,3,1] 的下一个排列是 [3,1,2] 。
 * 而 arr = [3,2,1] 的下一个排列是 [1,2,3] ，因为 [3,2,1] 不存在一个字典序更大的排列。
 * 给你一个整数数组 nums ，找出 nums 的下一个排列。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length,i=n-2,j=n-1;
        //1.从右往左找，非递减的数nums[i]
        for(;i>=0;i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        //2.从右再往左找，找到第一个大于nums[i]的nums[j]
        if(i>=0)
        {
            for(;j>=0;j--)
            {
                if(nums[j]>nums[i])
                {
                    break;
                }
            }
            //3.交换nums【i】和nums【j】，并且用双指针，逆序i右边的部分
            swap(i,j,nums);
            reverse(nums,i+1);
        }
        else{
            reverse(nums,i+1);
        }

    }

    private void reverse(int[] nums, int left) {
        int right=nums.length-1;
        while(left<right)
        {
            swap(left,right,nums);
            left++;right--;
        }
    }

    private void swap(int i, int j, int[] nums) {
        int tmp;
        tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
