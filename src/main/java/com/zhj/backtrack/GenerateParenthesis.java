package com.zhj.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月14日 9:25
 */
public class GenerateParenthesis {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n<=0) return res;
        int left=0,right=0;
        dfs("",n,n);
        return res;
    }

    private void dfs(String s, int left, int right) {
        //如果左右同时等于0说明分配完了。
        if(left==0&&right==0)
        {
            res.add(s);
            return ;
        }
        //左右相等，先使用左括号
        if(left==right)
        {
            dfs(s+"(",left-1,right);
        } else if (left<right) {
            //左括号少于右括号，左右都可以
            if(left>0)
            {
                dfs(s+"(",left-1,right);
            }
            //左括号没了，右括号
            dfs(s+")",left,right-1);
        }
    }
}
