package com.zhj.matrix;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月25日 10:29
 */
public class GmeOfLife {
    public static void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length,count=0;
        int[][] tmp=new int[m+2][n+2];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                tmp[i+1][j+1]=board[i][j];
            }
        }
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {   count=0;
                count=
                        tmp[i-1][j-1]+tmp[i-1][j]+tmp[i-1][j+1]+tmp[i][j-1]+tmp[i][j+1]+tmp[i+1][j-1]+tmp[i+1][j]+tmp[i+1][j+1];
                if(count<2)
                {
                    board[i-1][j-1]=0;
                }
                else if(count==2||count==3)
                {
                    if(board[i-1][j-1]==1)
                        continue;
                }
                else if(count>3)
                {
                    board[i-1][j-1]=0;
                }
               if(count==3)
               {
                   if(board[i-1][j-1]==0)
                       board[i-1][j-1]=1;
               }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
