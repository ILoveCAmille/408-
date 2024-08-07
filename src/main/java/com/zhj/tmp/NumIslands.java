package com.zhj.tmp;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 16:49
 */
public class NumIslands {
    public static int  numIslands(char[][] grid) {
        int res=0,m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++)
        {   int a;
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    res++;
                    area(grid,i,j);
                }
            }
        }
        return res;
    }

    private static void area(char[][] grid, int i, int j) {
        if(!inGrid(grid,i,j)) return;
        if(grid[i][j]!='1') return ;
        grid[i][j]='2';
        area(grid,i-1,j);
        area(grid,i+1,j);
        area(grid,i,j-1);
        area(grid,i,j+1);
        return ;
    }

    private static boolean inGrid(char[][] grid, int i, int j) {
        return 0<=i&&i<grid.length&&0<=j&&j<grid[0].length;
    }
}
