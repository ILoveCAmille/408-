package com.zhj.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月13日 10:03
 */
public class Subsets {
    List<Integer> tmp=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return res;
    }

    private void dfs(int cur, int[] nums) {
        if(cur==nums.length)
        {
            res.add(new ArrayList<>(tmp));
            return ;
        }
        tmp.add(nums[cur]);//要第cur位数字，深搜
        dfs(cur+1,nums);
        tmp.remove(tmp.size()-1);//不要第cur位数字，深搜
        dfs(cur+1,nums);
    }
}
