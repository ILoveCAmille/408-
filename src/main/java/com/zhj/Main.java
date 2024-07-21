package com.zhj;

import com.zhj.search.skiplist.Node;
import com.zhj.search.skiplist.SkipList;
import com.zhj.sort.*;
import com.zhj.tmp.Student;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,6,9,5,2};
        int MAX_LEVEL=32;
        int key;
        SkipList s=SkipList.getNewSkipList(MAX_LEVEL);
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt(-1))
        {    key=in.nextInt();
            s.insert(s,key);
        }
        s.output(s);
        while(in.hasNextInt(-1))
        {
            key=in.nextInt();
            Node p=s.find(s,key);
            if(p!=null) System.out.println("find key:"+p.getKey());
            else System.out.println("null");
        }
    }
}