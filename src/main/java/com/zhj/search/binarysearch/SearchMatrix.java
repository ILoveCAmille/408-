package com.zhj.search.binarysearch;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月19日 9:29
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int up=-1,down=matrix.length-1,left=0,right=matrix[0].length-1;
        int x=(up+down)/2,y=(left+right)/2;
        //1.搜索第一行
        while(up<down)
        {   x=(down-up+1)/2+up;
            if(matrix[x][0]<=target)
            {
                up=x;
            }
            else
                down=x-1;
        }
        x=up;
        if(x<0) return false;
        //2.搜索目标行
        while(left<=right)
        {
            y=(left+right)/2;
            if(target==matrix[x][y])
            {
                return true;
            } else if (target<matrix[x][y]) {
                right=y-1;
            }else {
                left=y+1;
            }
        }
        //3.返回结果
        return false;
    }
}
