package com.zhj.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月22日 9:13
 */

//输出一个杨辉三角
public class YangHuiTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {List<Integer> list=new ArrayList<>();
            for(int j=0;j<i+1;j++)
            {
                if(j==0||j==i)
                    list.add(j,1);
                else
                    list.add(j,res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            res.add(list);
        }
        return res;
    }
}
