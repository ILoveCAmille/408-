package com.zhj;

import com.zhj.Recursion.DecodeString;
import com.zhj.matrix.Rotate12;
import com.zhj.slidingwindow.ContainsNearbyDuplicate;
import com.zhj.slidingwindow.FindLength;
import com.zhj.slidingwindow.FindRepeatedDnaSequences;
import com.zhj.slidingwindow.MedianSlidingWindow;
import com.zhj.tmp.NumIslands;
import com.zhj.two_pointer.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        DecodeString decodeString=new DecodeString();
        System.out.println(decodeString.decodeString(s));
    }
}