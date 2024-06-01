package com.zhj;

import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {


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

    public static void function(){
        int array2[]=new int[2];
        int min = 1;
        int max = 10;
        int randomLimit;
        int N=10;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer>  map=new HashMap<>();
        int  ar[]=new int[N];
        Random random=new Random();
        for (int i=0;i<N;i++)
        {
            randomLimit = random.nextInt(max - min + 1) + min;
            ar[i]=randomLimit;
            set.add(ar[i]);
            map.put(ar[i],0);
        }
        for(int i=0;i<N;i++)
        {
            for(int e: map.keySet()){
                if(ar[i]==e)
                {
                    if(map.get(e)==0){
                        map.get(e)++;
                    }

                }
            }
        }
      /*  Iterator<Integer> iterator = set.iterator();
        int i=0;
        while(iterator.hasNext()){
            int e = iterator.next();
            if(e==ar[i])
            {

            }
        }*/
    }
}