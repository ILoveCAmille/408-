package com.zhj.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月07日 12:27
 */
public class Merge {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][2];
        Arrays.sort(intervals, (o1, o2) -> o1[0]-o2[0]);
        List<int[]> merged=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int L=intervals[i][0],R=intervals[i][1];
            if(merged.size()==0||merged.get(merged.size()-1)[1]<L){
                merged.add(new int[]{L,R});
            }
            else {
                merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
