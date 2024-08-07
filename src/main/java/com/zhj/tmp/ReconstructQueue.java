//package com.zhj.tmp;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
///**
// * 功能描述
// *
// * @author: scott
// * @date: 2024年08月05日 10:17
// */
//public class ReconstructQueue {
//    public int[][] reconstructQueue(int[][] people) {
//        Arrays.sort(people, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0]!=o2[0])
//                 return o1[0]-o2[0];
//                else
//                    return o2[1]-o2[1];
//            }
//        });
//        int n=people.length;
//        int[][] res=new int[n][2];
//        for (int[] person : people) {
//            int spaces = person[1] + 1;
//            for (int i = 0; i < n; ++i) {
//                if (ans[i] == null) {
//                    --spaces;
//                    if (spaces == 0) {
//                        ans[i] = person;
//                        break;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//}
