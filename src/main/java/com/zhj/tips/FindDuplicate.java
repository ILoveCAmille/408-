package com.zhj.tips;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月04日 11:18
 * 287. 寻找重复数
 * 已解答
 * 中等
 * 相关标签
 * 相关企业
 * 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 [1, n] 范围内（包括 1 和 n），可知至少存在一个重复的整数。
 *
 * 假设 nums 只有 一个重复的整数 ，返回 这个重复的数 。
 *
 * 你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间
 */

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        //快慢指针
        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=0;
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        return slow;
    }
}
