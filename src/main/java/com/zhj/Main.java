package com.zhj;

import com.zhj.sort.BinarySearch;
import com.zhj.sort.BubbleSort;
import com.zhj.tmp.Student;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Student s=new Student("z0",0);
        Student[] s1=new Student[s.getMax()];
        Random rand = new Random();
        for(int i=0;i<s.getMax()-1;i++)
        {
            s=new Student("z"+i, rand.nextInt(100+1));
            s1[i]=s;
        }
        s.BubbleSort(s1);
        for (int i=0;i<s1.length-1;i++) {
            System.out.println(s1[i].toString());
        }

    }
}