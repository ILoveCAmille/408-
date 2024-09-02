package com.zhj.two_pointer;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月02日 10:09
 */
public class MoveZeroes {
    public static void main(String[] args){
        int[] nums=new int[]{0,1,0,3,12};
        MoveZeroes.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
    public static void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
