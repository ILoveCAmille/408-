package com.zhj.matrix;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月07日 13:35
 */
public class SearchMatrix
{   //亲测两层二分巨难写  你会遇到几个问题，1.如果没有答案，你会在图里循环，然后超时   2.如果你创建新的条件，就会破坏正确答案的判断。
   /* public static void main(String[] args){
//        int target=20;
//        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int target=5;
//        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int target=3;
//        int[][] matrix={{-1,3}};
        int target=4;
        int[][] matrix={{1,4},{2,5}};
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        if(m==1&&n==1) return matrix[m-1][n-1]==target;
        int up=0,down=matrix.length-1,left=0,right=matrix[0].length-1;
        int[] mid={(up+down)/2,(left+right)/2};
        if(matrix[mid[0]][mid[1]]==target)
        {
            return true;
        }
        while(up<=down&&left<=right){
            if(m>1)
            {
                //上下移动
                if(target<matrix[mid[0]][mid[1]]){
                    down=mid[0]-1;
                    mid[0]=(up+down)/2;
                }
                else {
                    up=mid[0]+1;
                    mid[0]=(up+down)/2;
                }
                //移动完判断一下越界
                if(up>down)
                    break;
                //每次移动万都有可能找到目标，所以判断一下
                if(matrix[mid[0]][mid[1]]==target)
                {
                    return true;
                }
            }
           if(n>1){
               //左右移动
               if(target<matrix[mid[0]][mid[1]]){
                   right=mid[1]-1;
                   mid[1]=(left+right)/2;
               }
               else {
                   left=mid[1]+1;
                   mid[1]=(left+right)/2;
               }
               //移动完判断一下越界
               if(left>right)
                   break;
               //每次移动万都有可能找到目标，所以判断一下
               if(matrix[mid[0]][mid[1]]==target)
               {
                   return true;
               }
           }
        }
        return false;
    }*/
    //z字型搜索，方法很好，通过一步一步压缩结果集的范围得到答案
   public boolean searchMatrix(int[][] matrix, int target) {
        int x=0,y=matrix[0].length-1,m= matrix.length, n=matrix[0].length;
        while(x<m&&y>=0){
            if(matrix[x][y]==target)
                return true;
            if(target<matrix[x][y]){
                y--;
            }
            else{
                x++;
            }
        }
        return false;
   }
}
