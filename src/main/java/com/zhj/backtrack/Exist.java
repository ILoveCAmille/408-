package com.zhj.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月14日 10:38
 */
public class Exist {
    public boolean exist(char[][] board, String word) {
        boolean res=false;
        List<Character> tmp=new ArrayList<>();
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dfs(board,word,tmp,0,0);
            }
        }
        return res;
    }

    private void dfs(char[][] board, String word, List<Character> tmp,int x,int y) {

    }
}
