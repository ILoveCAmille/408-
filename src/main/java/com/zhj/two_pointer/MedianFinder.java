package com.zhj.two_pointer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月30日 14:05
 */
public class MedianFinder {
//    private List<Integer> list=new ArrayList<>();
//    public MedianFinder() {
//    }
//
//    public void addNum(int num) {
//        list.add(num);list.sort(Comparator.naturalOrder());
//    }
//
//    public double findMedian() {
//        int size=list.size();
//        if(list.size()%2==1) return list.get(size/2);
//        else {
//            return Double.parseDouble(String.format("%.1f",
//                    ((double)list.get((size - 1) / 2) + (double)list.get(size / 2)) /2));
//        }
//    }
    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;
    public MedianFinder() {
        queMin= new PriorityQueue<>();
        queMax=new PriorityQueue<>((a,b)->(b-a));
    }

    public void addNum(int num) {
       if(queMin.size()==0||num>=queMin.peek())
       {
           queMin.offer(num);
           if(queMax.size()+1<queMin.size())
           {
               queMax.offer(queMin.poll());
           }
       }
       else
       {
           queMax.offer(num);
           if(queMax.size()>queMin.size())
               queMin.offer(queMax.poll());
       }
    }

    public double findMedian() {
        if((queMin.size()+queMax.size())%2==1)
            return queMin.peek();
        else
        {
            return ((double)queMin.peek()+(double)queMax.peek())/2;
        }

    }

}
