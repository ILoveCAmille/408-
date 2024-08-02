package com.zhj.slidingwindow;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月01日 9:41
 */
public class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        list.sort((a,b)->{
           if(Math.abs(a-x)!=Math.abs(b-x))
           {
               return Math.abs(a-x)-Math.abs(b-x);
           }
           else{
            return a-b;
           }
        });
        List<Integer> res=list.subList(0,k);
        Collections.sort(res);
        return res;
    }
}
