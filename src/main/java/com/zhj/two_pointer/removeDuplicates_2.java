package com.zhj.two_pointer;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月17日 10:05
 * 80. 删除有序数组中的重复项 II
 * 中等
 * 相关标签
 * 相关企业
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class removeDuplicates_2 {
   /* 示例 1：

    输入：nums = [1,1,1,2,2,3]
    输出：5, nums = [1,1,2,2,3]
    解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
    示例 2：

    输入：nums = [0,0,1,1,1,1,2,3,3]
    输出：7, nums = [0,0,1,1,2,3,3]
    解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。*/
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        //长度小于等于2就不用判断了，直接返回
        if(n<=2)
            return n;
        int slow=2,fast=2;
        //fast作为探路指针
        while(fast<n){
            //
            if(nums[slow-2]!=nums[fast])
            {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
