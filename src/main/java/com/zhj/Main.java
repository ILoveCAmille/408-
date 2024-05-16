package com.zhj;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(-2));
    }
        /*Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<ar.toArray().length;i++)
        {
            if(!map.containsKey(ar.get(i))){
                map.put(ar.get(i),1);
            }
            else{
                map.put(ar.get(i),map.get(ar.get(i))+1);
            }
        }
    System.out.println("args = " +map.toString());*/
    int array2[]=new int[2];
    int N=10;
    Set<Integer> set = new HashSet<>();
    int  ar[]=new int[N];
    Random random=new Random();
    for (int i=0;i<N;i++)
    { ar[i]=random.nextInt();
        set.add(ar[i]);
    }
    for(int i=0;i<N;i++)
    {
        if(ar[i]==set.)
    }
    Iterator<Integer> iterator = set.iterator();
    int i=0;
    while(iterator.hasNext()){
        int e = iterator.next();
        if(e==ar[i])
        {

        }
    }
}

    public int function(){

    }
}