package com.zhj.graph;

import java.util.*;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月12日 9:26
 */
public class FindOrder {
    public static void main(String[] args){
//        int numCourses=4;
//        int[][] prerequisites=new int[][]{{1,0},{2,0},{3,1},{3,2}};
//        for (int i : findOrder(numCourses, prerequisites)) {
//            System.out.print(i+" ");
//        }
    }
    //课程表经典拓扑排序题目 DFS
     /*List<List<Integer>> edges;
     int[] visited;
     Stack<Integer> stack;
     boolean valid=true;
    public  int[] findOrder(int numCourses, int[][] prerequisites) {
        //构建邻接表
        edges=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            edges.add(new ArrayList<>());
        }
        visited=new int[numCourses];
        stack=new Stack<>();
        int[] res=new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            edges.get(prerequisite[1]).add(prerequisite[0]);
        }
        for(int i=0;i<numCourses&&valid;i++)
        {
            if(visited[i]==0)
            {
                dfs(i);
            }
        }
        if(!valid)
        {
            return new int[0];
        }
        int size=stack.size();
        for(int i=0;i<size;i++)
        {
            res[i]=stack.pop();
        }
        return res;
    }

    private void dfs(int u) {
        visited[u]=1;
        for (Integer v : edges.get(u)) {
            if(visited[v]==0)
            {
                dfs(v);
                if(!valid)
                    return ;
            } else if (visited[v]==1) {
                valid=false;
                return ;
            }
        }
        visited[u]=2;
        stack.push(u);
    }*/
    List<List<Integer>> edges;
    int[] indegree;
    int[] res;
    int index=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        indegree=new int[numCourses];
        edges=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            edges.add(new ArrayList<>());
        }
            Queue<Integer> queue=new ArrayDeque<>();
        for (int[] prerequisite : prerequisites) {
            edges.get(prerequisite[1]).add(prerequisite[0]);
            ++indegree[prerequisite[0]];
        }
        res=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                queue.offer(i);
            }
        }
        while(!queue.isEmpty())
        {
            int u=queue.poll();
            for (Integer v : edges.get(u)) {
                --indegree[v];
                if(indegree[v]==0)
                    queue.offer(v);
            }
            res[index]=u;
            ++index;
        }
        for (int i : indegree) {
            if(i!=0)
                return new int[0];
        }
        return res;
    }

}
