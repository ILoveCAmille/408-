package com.zhj.written;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月21日 20:13
 */
public class wy_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s=in.nextLine();
        String[] arr=s.substring(1, s.length() - 1).split(",");
        int[] arrs=new int[arr.length];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=1;i<=9;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++)
        {
            arrs[i]=Integer.parseInt(arr[i]);
        }
        int j=0,max=0,k;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i : arrs) {
            max=0;
            k=i;
            while(i!=0)
            {   j=i%10;
                i=i/10;
                max=Math.max(j,max);
            }
            list=map.get(max);
            list.add(k);
            map.put(max,list);
        }
        int res=Integer.MIN_VALUE;
        for(int i=1;i<=9;i++)
        {
            list=map.get(i);
            list.sort((o1,o2)->o1-o2);
            if(list.size()<2)
                continue;
            int tmp=list.get(list.size()-1)+list.get(list.size()-2);
            res=Math.max(res,tmp);
        }
        System.out.println(res);
    }
}
