package com.zhj.tips;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月27日 11:25
 * 136. 只出现一次的数字
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single=0;
        for (int num : nums) {
            single ^=num;
        }
        return single;
    }
}

