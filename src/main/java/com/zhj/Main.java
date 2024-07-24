package com.zhj;

import com.zhj.dynamic.*;
import com.zhj.hash.GroupAnagrams;
import com.zhj.hash.TwoSum;
import com.zhj.search.skiplist.Node;
import com.zhj.search.skiplist.SkipList;
import com.zhj.sort.*;
import com.zhj.tmp.Student;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String[] strs=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        for (List<String> groupAnagram : GroupAnagrams.groupAnagrams(strs)) {
            System.out.println(groupAnagram);
        }
    }
}