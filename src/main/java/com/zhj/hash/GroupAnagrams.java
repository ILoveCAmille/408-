package com.zhj.hash;

import java.util.*;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月24日 14:21
 */
public class GroupAnagrams {
    public static   List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String str : strs) {
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            List<String> list =map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
