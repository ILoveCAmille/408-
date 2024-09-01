package com.zhj.number_theory;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月01日 17:17
 * 1979. 找出数组的最大公约数
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。
 *
 * 两个数的 最大公约数 是能够被两个数整除的最大正整数。
 */
public class FindGCD {
    public int findGCD(int[] nums) {
        //1.找最大值最小值
        int max=1,min=1000;
        for (int num : nums) {
           if(num>max) max=num;
           if(num<min) min=num;
        }
        //2.gcd公约数,辗转相除法.u:被除数 v：除数
        int u=max,v=min,t;
        while(v!=0)
        {   t=v;
            v=u%v;
            u=t;
        }
        return u;
    }
}
