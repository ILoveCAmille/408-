package com.zhj;

import com.zhj.sort.*;
import com.zhj.tmp.Student;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,6,9,5,2};

        MergeSort.mergeSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}