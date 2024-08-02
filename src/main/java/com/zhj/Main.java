package com.zhj;

import com.zhj.matrix.Rotate12;
import com.zhj.slidingwindow.ContainsNearbyDuplicate;
import com.zhj.slidingwindow.FindLength;
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
        String s2=in.nextLine();
        String[] s3=s2.split(",");
        String[] s1=s.split(",");
        int[] nums1= new int[s1.length];
        int[] nums2=new int[s3.length];
        for(int i=0;i<s1.length;i++)
            nums1[i]= Integer.parseInt(s1[i]);
        for(int i=0;i<s3.length;i++)
            nums2[i]=Integer.parseInt(s3[i]);
        FindLength findLength=new FindLength();
        System.out.println(findLength.findLength(nums1,nums2));
    }
}