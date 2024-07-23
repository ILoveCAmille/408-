package com.zhj;

import com.zhj.dynamic.*;
import com.zhj.search.skiplist.Node;
import com.zhj.search.skiplist.SkipList;
import com.zhj.sort.*;
import com.zhj.tmp.Student;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,6,9,5,2};
        int[] cost={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(MinCostClimbingStairs.minCostClimbingStairs(cost));
    }
}