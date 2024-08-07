package com.zhj.graph;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月05日 11:25
 *
代码
测试用例
测试结果
测试结果
547. 省份数量
中等
相关标签
相关企业
有 n 个城市，其中一些彼此相连，另一些没有相连。如果城市 a 与城市 b 直接相连，且城市 b 与城市 c 直接相连，那么城市 a 与城市 c 间接相连。

省份 是一组直接或间接相连的城市，组内不含其他没有相连的城市。

给你一个 n x n 的矩阵 isConnected ，其中 isConnected[i][j] = 1 表示第 i 个城市和第 j 个城市直接相连，而 isConnected[i][j] = 0 表示二者不直接相连。

返回矩阵中 省份 的数量。


 */
public class FindCircleNum {
/*1.深度优先搜索查找连通分量。深度优先因为进行较多栈的操作所以比较快。
    public int findCircleNum(int[][] isConnected) {
        int cities= isConnected.length;
        boolean[] visited=new boolean[cities];
        int provinces=0;
        for(int i=0;i<cities;i++)
        {
            if(!visited[i])
            {
                dfs(isConnected,visited,cities,i);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int cities, int i) {
        for(int j=0;j<cities;j++)
        {
            if(isConnected[i][j]==1&&!visited[j])
            {
                visited[j]=true;
                dfs(isConnected,visited,cities,j);
            }
        }
    }
*/
/* 广度优先搜索查找连通分量  这个慢得多 6ms
    public int findCircleNum(int[][] isConnected) {
       int cities =isConnected.length;
       boolean[] visited=new boolean[cities];
       int provinces=0;
        Queue<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<cities;i++)
        {
            if(!visited[i])
            {
                queue.offer(i);
                while(!queue.isEmpty())
                {
                    int j=queue.poll();
                    visited[j]=true;
                    for(int k=0;k<cities;k++)
                    {
                        if(isConnected[j][k]==1&&!visited[k]){
                            queue.offer(k);
                        }
                    }
                }
                provinces++;
            }
        }
        return provinces;
    }*/
//和深度优先搜索速度差不多，都是1ms
    public int findCircleNum(int[][] isConnected) {
       int cities=isConnected.length;
       int[] parent=new int[cities];
       int provinces=0;
       //初始化并查集
        for(int i=0;i<cities;i++)
            parent[i]=i;
        //合并这些顶点
        for(int i=0;i<cities;i++)
        {
            for(int j=i+1;j<cities;j++)
            {
                if(isConnected[i][j]==1)
                {
                    union(parent,i,j);
                }
            }
        }

        for(int i=0;i<cities;i++)
        {
            if(parent[i]==i)
            {
                provinces++;
            }
        }
        return provinces;

    }

    public void union(int[] parent,int i,int j)
    {
        parent[find(parent,i)]=find(parent,j);
    }
    public int find(int[] parent,int index){
        if(parent[index]!=index)
        {
            parent[index]=find(parent,parent[index]);
        }
        return parent[index];
    }
}
