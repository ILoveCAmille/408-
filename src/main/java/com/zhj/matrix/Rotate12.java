package com.zhj.matrix;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月25日 11:36
 */
public class Rotate12 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        Rotate12.rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        //先转置，在左右兑换
        int tmp,n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(j==i) continue;
                tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }

        for(int j=0;j<n/2;j++)
        {
            for(int i=0;i<n;i++)
            {
                tmp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=tmp;
            }
        }
    }
}

