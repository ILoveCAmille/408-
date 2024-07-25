package com.zhj.matrix;


import java.util.BitSet;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月25日 13:02
 */
public class SetZeroes {
    public static void main(String[] args){
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
            setZeroes(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf(anInt+" ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length,up,down,left,right;
        BitSet[] flags=new BitSet[m];
        for (int i = 0; i < m; i++) {
            flags[i]=new BitSet(n);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {   up=down=i;left=right=j;
                if(matrix[i][j]==0)
                {
                    left--;
                    while(left>=0) {flags[i].set(left);left--;}
                    right++;
                    while(right<=n-1) {flags[i].set(right);right++;}
                    up--;
                    while(up>=0) {flags[up].set(j);up--;}
                    down++;
                    while(down<=m-1) {flags[down].set(j);down++;}
                }
            }

        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(flags[i].get(j))
                {
                    matrix[i][j]=0;
                }
            }

        }
    }
}
