package com.zhj;

import com.zhj.matrix.Rotate12;
import com.zhj.slidingwindow.ContainsNearbyDuplicate;
import com.zhj.slidingwindow.FindRepeatedDnaSequences;
import com.zhj.slidingwindow.MedianSlidingWindow;
import com.zhj.two_pointer.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int k;
        k=in.nextInt();
        String[] s1=s.split(",");
        int[] nums = new int[s1.length];
        for(int i=0;i<s1.length;i++)
            nums[i]= Integer.parseInt(s1[i]);
        MedianSlidingWindow medianSlidingWindow=new MedianSlidingWindow();
        for (double v : medianSlidingWindow.medianSlidingWindow(nums, k)) {
            System.out.printf(v+" ");
        }
    }
}