package com.zhj.search.binarysearch;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月18日 8:06
 */
public class MySqrt {
    public int mySqrt(int x) {
        int l=0,r=x,ans=-1;
        while(l<=r)
        {
         int mid=(l+r)/2;
         if((long)mid*mid<=x)
            {
                ans=mid;
                l=mid+1;
            }
         else
            {
                r=mid-1;
            }
        }
        return ans;
    }
}
