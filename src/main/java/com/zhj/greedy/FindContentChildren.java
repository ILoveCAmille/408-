package com.zhj.greedy;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月17日 8:12
 */
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int i=0,j=0;i<g.length&&j<s.length;i++,j++)
        {
            while(j<s.length&&g[i]>s[j])
            {
                j++;
            }
            if(j<s.length)
                count++;
        }
        return count;
    }
}
