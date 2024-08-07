package com.zhj.tmp;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 17:47
 */
public class IslandPerimeter {
    //遍历+深搜
    public int islandPerimeter(int[][] grid) {
        int res=0,m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                    return dfs(grid,i,j);
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(!inArea(grid,i,j))
            return 1;
        if(grid[i][j]==0)
            return 1;
        if(grid[i][j]!=1)
            return 0;
        grid[i][j]=2;
        return dfs(grid,i-1,j)
                +dfs(grid,i+1,j)
                +dfs(grid,i,j-1)
                +dfs(grid,i,j+1);

    }

    private boolean inArea(int[][] grid, int i, int j) {
        return 0<=i&&i<grid.length&&0<=j&&j<grid[0].length;
    }


}
