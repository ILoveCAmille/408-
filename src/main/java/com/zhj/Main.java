package com.zhj;

import com.zhj.dynamic.YangHuiTriangle;
import com.zhj.dynamic.YangHuiTriangle2;
import com.zhj.search.skiplist.Node;
import com.zhj.search.skiplist.SkipList;
import com.zhj.sort.*;
import com.zhj.tmp.Student;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,6,9,5,2};
        for (Integer integer : YangHuiTriangle2.getRow(0)) {
            System.out.println(integer);
        }
    }
}