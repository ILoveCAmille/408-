package com.zhj.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月07日 10:33
 */
public class AllPathsSourceTarget {
    List<List<Integer>> ans;
    Deque<Integer> stack=new ArrayDeque<Integer>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        dfs(graph,0,graph.length-1);
        return ans;
    }
    public  void dfs(int[][] graph,int x,int n)
    {
        if(x==n)
        {
            ans.add(new ArrayList<>(stack));
            return;
        }
        for (int y : graph[x]) {
            stack.addLast(y);
            dfs(graph,y,n);
            stack.pollLast();
        }
    }
}
