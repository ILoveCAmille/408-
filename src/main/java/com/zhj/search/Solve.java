package com.zhj.search;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月16日 7:32
 */
public class Solve {
    int m,n;

//    public void dfs(char[][] board,int i,int j){
//        if(i<0||i>=m||j<0||j>=n||board[i][j]!='O')
//            return;
//        board[i][j]='A';
//        dfs(board,i-1,j);
//        dfs(board,i+1,j);
//        dfs(board,i,j-1);
//        dfs(board,i,j+1);
//    }
//    public void solve(char[][] board) {
//         m=board.length;n=board[0].length;
//        if(m==0) return ;
//        for(int i=0;i<m;i++)
//        {
//            dfs(board,i,0);
//            dfs(board,i,n-1);
//        }
//        for(int j=1;j<n-1;j++)
//        {
//            dfs(board,0,j);
//            dfs(board,m-1,j);
//        }
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(board[i][j]=='A')
//                {
//                    board[i][j]='O';
//                } else if (board[i][j]=='O') {
//                    board[i][j]='X';
//                }
//            }
//        }
//    }
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public void solve(char[][] board){
        m= board.length;;n=board[0].length;
        if(n==0) return;
        Queue<int[]> queue=new ArrayDeque<>();
        for(int i=0;i<m;i++)
        {
            if(board[i][0]=='O')
            {queue.offer(new int[]{i,0});board[i][0]='A';
            }
            if(board[i][n-1]=='O')
            {queue.offer(new int[]{i,n-1});board[i][n-1]='A';}
        }
        for(int j=1;j<n-1;j++)
        {
            if(board[0][j]=='O')
            {queue.offer(new int[]{0,j});board[0][j]='A';}
            if(board[m-1][j]=='O')
            {queue.offer(new int[]{m-1,j});board[m-1][j]='A';}
        }
        while(!queue.isEmpty())
        {
            int[] cell=queue.poll();
            int x=cell[0],y=cell[1];
            for(int i=0;i<4;i++)
            {
                int mx=x+dx[i],my=y+dy[i];
                if(mx<0||mx>=m||my<0||my>=n||board[mx][my]!='O')
                    continue;
                queue.offer(new int[]{mx,my});
                board[mx][my]='A';
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='A')
                board[i][j]='O';
                else if (board[i][j]=='O') board[i][j]='X';
            }
        }
    }
}
