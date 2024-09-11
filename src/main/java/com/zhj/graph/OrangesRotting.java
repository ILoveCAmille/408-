package com.zhj.graph;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月11日 11:17
 * 994. 腐烂的橘子
 * 中等
 * 相关标签
 * 相关企业
 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
 *
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
 *
 * 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
 */
public class OrangesRotting {
    public static void main(String[] args)
    {   int[][] grid={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
    private static int[] dx={0,0,-1,1};
    private  static int[] dy={-1,1,0,0};
    public static int orangesRotting(int[][] grid) {
        //多源BFS经过的轮数
        Queue<Integer> queue=new ArrayDeque<>();
        HashMap<Integer,Integer> depth=new HashMap<>();
        int m= grid.length, n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    queue.add(i*n+j);
                    depth.put(i*n+j,0);
                }
            }
        }
        int ans=0;
        while(!queue.isEmpty())
        {   int place=queue.poll();
            int x=place/n,y=place%n;
            for(int i=0;i<4;i++)
            {
                x=place/n+dx[i];
                y=place%n+dy[i];
                if(isValid(x,y,grid)&&grid[x][y]==1)
                {
                    grid[x][y]=2;
                    queue.add(x*n+y);
                    depth.put(x*n+y,depth.get(place)+1);
                    ans=Math.max(ans,depth.get(x*n+y));
                }
            }
        }
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if(anInt==1)
                    return -1;
            }
        }
        return ans;
    }

    private static boolean isValid(int x, int y, int[][] grid) {
        return x>=0&&x<= grid.length-1&&y>=0&&y<=grid[0].length-1;
    }
}
