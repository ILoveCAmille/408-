package com.zhj.written;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月11日 14:02
 */
public class Diff {
    public static void main(String[] args){
        ArrayList<Long> leftIds= new ArrayList<>();
        leftIds.add(1L);leftIds.add(2L);
        ArrayList<String> leftValues=new ArrayList<>();
        //[1,2],["nowcoder","best"],[1,2],["nowcoder","great"]
        leftValues.add("nowcoder");leftValues.add("best");
        ArrayList<Long> rightIds=new ArrayList<>();ArrayList<String> rightValues=new ArrayList<>();
        rightIds.add(1L);rightValues.add("nowcoder");
        for (ArrayList<Long> longs : diff(leftIds, leftValues, rightIds, rightValues)) {
            for (Long aLong : longs) {
                System.out.print(aLong+"");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Long>> diff (ArrayList<Long> leftIds, ArrayList<String> leftValues,
                                             ArrayList<Long> rightIds, ArrayList<String> rightValues) {
       ArrayList<ArrayList<Long>> res=new ArrayList<>();
        HashMap<Long,String> old=new HashMap<>();
        HashMap<Long,String> now=new HashMap<>();
        ArrayList<Long> delete=new ArrayList<>();
        ArrayList<Long> update=new ArrayList<>();
        ArrayList<Long> add=new ArrayList<>();
        //map存储旧值和新值
        for(int i=0;i<leftIds.size();i++)
        {
            old.put(leftIds.get(i),leftValues.get(i));
        }
        for(int i=0;i<rightIds.size();i++)
        {
            now.put(rightIds.get(i),rightValues.get(i));
        }
        //遍历旧数据找到删除和修改的部分
        for (Long aLong : old.keySet()) {
            if(now.get(aLong)==null)
            {
                delete.add(aLong);
            }
            else if(!now.get(aLong).equals(old.get(aLong)))
            {
                update.add(aLong);
            }
        }
        //遍历新数据找到新增的部分
        for (Long aLong : now.keySet()) {
            if(old.get(aLong)==null)
            {
                add.add(aLong);
            }
        }
        res.add(0,add);
        res.add(1,update);
        res.add(2,delete);
        return res;
    }
}
