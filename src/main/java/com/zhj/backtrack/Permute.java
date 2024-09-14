package com.zhj.backtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月13日 9:29
 *
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>  res=new ArrayList<>();
       List<Integer> output=new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n=nums.length;
        backtrack(n,output,res,0);
        return res;
    }

    private void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        if(first==n)
        {
            res.add(new ArrayList<>(output));
        }
        for(int i=first;i<n;i++)
        {
            Collections.swap(output,first,i);
            backtrack(n,output,res,first+1);
            Collections.swap(output,first,i);
        }
    }

}
