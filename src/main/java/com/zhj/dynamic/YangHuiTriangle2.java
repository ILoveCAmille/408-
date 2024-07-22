package com.zhj.dynamic;
import java.util.ArrayList;
import java.util.List;
/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月22日 9:59
 */
public class YangHuiTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        List<Integer> tmp=new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++)
        {
            tmp.clear();
            for(int j=0;j<i+1;j++)
            {
                if(j==0||j==i)
                    tmp.add(j,1);
                else tmp.add(j, res.get(j-1)+res.get(j));
            }
            res.clear();
            res.addAll(tmp);
        }
        return res;
    }
}
