package com.zhj.written;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2025年03月03日 9:56
 */
public class Xiao1 {
    public class Interval {
   int start;
   int end;
   public Interval(int start, int end) {this.start = start;this.end = end;
   }
    }


    public static void main(String[] args){
                System.out.println();
    }

    public static int answer (int n) {
        int tmp=0,count=0,k;
        Set<Integer> set=new HashSet<>();
        for(int i=11;i<Math.pow(10,n);i++){
            tmp=i;
            while(tmp!=0){
                 k=tmp%10;
                if(set.contains(k))
                {count++;break;}
                set.add(k);
                tmp=tmp/10;
            }
            set.removeAll(set);
        }
        return (int)Math.pow(10,n)-count;
    }
    public List<Interval> merge(List<Interval> color){
        for(int i=0;i<color.size()-1;i++){
            if(color.get(i).end>=color.get(i+1).start){
                color.get(i).end=color.get(i+1).end;
                color.remove(i+1);
            }
        }
        return color;
    }

    public int getLength(List<Interval> red,List<Interval> blue){
        int length=0;
        for(int i=0;i<blue.size();i++){

        }
        return 0;
    }
    public  int GetMaxPurpleLength (Interval[] redSegments, Interval[] blueSegments) {
        // write code here
        List<Interval> red=new LinkedList<>();
        red= Arrays.stream(redSegments).collect(Collectors.toList());
        List<Interval> blue=new LinkedList<>();
        blue=Arrays.stream(blueSegments).collect(Collectors.toList());
        red.sort((Comparator<Interval>) (o1, o2) -> {
            if(o1.start!=o2.start) return o1.start-o2.start;
             return o1.end-o2.end;
        });
        blue.sort((Comparator<Interval>) (o1, o2) -> {
            if(o1.start!=o2.start) return o1.start-o2.start;
            return o1.end-o2.end;
        });
        red=merge(red);
        blue=merge(blue);
       return getLength(red,blue);
    }
}
