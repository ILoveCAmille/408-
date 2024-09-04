package com.zhj.slidingwindow;

import java.util.*;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月04日 11:52
 */
public class FindAnagrams {
    public static void main(String[] args){
        String s="cbaebabacd",p="abc";
        for (Integer anagram : FindAnagrams.findAnagrams(s, p)) {
            System.out.println(anagram);
        }
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int n=s.length(),m=p.length(),right=0;
        if(n<m) return new ArrayList<Integer>();;
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> mapS=new HashMap<>();
        HashMap<Character,Integer> mapP=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
            mapP.put(p.charAt(i),mapP.getOrDefault(p.charAt(i),0)+1);
        }
        if(mapS.equals(mapP))
            ans.add(0);
        for(int i=1;i<=n-m;i++)
        {
            mapS.put(s.charAt(i-1),mapS.getOrDefault(s.charAt(i-1),0)-1);
            if(mapS.getOrDefault(s.charAt(i-1),0)==0) mapS.remove(s.charAt(i-1));
            mapS.put(s.charAt(i+m-1),mapS.getOrDefault(s.charAt(i+m-1),0)+1);
            if(mapS.equals(mapP))
                ans.add(i);
        }
        return ans;
    }
}
