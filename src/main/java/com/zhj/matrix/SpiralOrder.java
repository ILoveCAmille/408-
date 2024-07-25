package com.zhj.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月25日 9:12
 */
public class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
            int up=-1,down= matrix.length,left=-1,right=matrix[0].length;
            int i=0,j=0,t=0;
            int matrixSize=down*right;
            List<Integer> list=new ArrayList<>();
            while(t<matrixSize)
            {
                while(j<right&&t<matrixSize)
                {
                    list.add(t, matrix[i][j]);t++;
                    j++;
                }
                up++;j=right-1;i++;
                while(i<down&&t<matrixSize)
                {
                    list.add(t, matrix[i][j]);t++;
                    i++;
                }
                right--;i=down-1;j--;
                while(left<j&&t<matrixSize)
                {
                    list.add(t, matrix[i][j]);t++;
                    j--;
                }
                down--;j=left+1;i--;
                while(up<i&&t<matrixSize)
                {
                    list.add(t, matrix[i][j]);t++;
                    i--;
                }
                left++;i=up+1;j++;
            }
            return list;
    }
}
