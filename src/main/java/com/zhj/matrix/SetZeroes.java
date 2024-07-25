package com.zhj.matrix;

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
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {   up=down=i;left=right=j;
                if(matrix[i][j]==0)
                {
                    left--;
                    while(left>=0) {if(matrix[i][left]!=0)matrix[i][left]=Integer.MIN_VALUE;left--;}
                    right++;
                    while(right<=n-1) {if(matrix[i][right]!=0)matrix[i][right]=Integer.MIN_VALUE;right++;}
                    up--;
                    while(up>=0) {if(matrix[up][j]!=0)matrix[up][j]=Integer.MIN_VALUE;up--;}
                    down++;
                    while(down<=m-1) {if(matrix[down][j]!=0)matrix[down][j]=Integer.MIN_VALUE;down++;}
                }
            }

        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==Integer.MIN_VALUE)
                {
                    matrix[i][j]=0;
                }
            }

        }
    }
}
