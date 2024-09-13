package com.zhj.written;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月11日 14:38
 */
public class Sort {
    static String orderBy = "sort1" ;
    static String orderType = "asc" ;
    static class  Animal {
        String name;
        int val1;
        int val2;

        public  Animal(String name, int val1, int val2) {
            this.name = name;
            this.val1 = val1;
            this.val2 = val2;
        }
    }
    public static void main(String[] args) {

        //sort1 asc
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        orderBy = s1[0];
        orderType = s1[1];
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Animal("ace",8,4));
        list.add(new Animal("bre",2,3));
        list.add(new Animal("cat",5,2));
        list.add(new Animal("dog",1,1));
        list.sort((o1, o2) -> {
            if (orderBy.equals("sort1") && orderType.equals("asc"))
                return o1.val1 - o2.val1;
            if (orderBy.equals("sort1") && orderType.equals("desc"))
                return o2.val1 - o1.val1;
            if (orderBy.equals("sort2") && orderType.equals("asc"))
                return o1.val2 - o2.val2;
            if (orderBy.equals("sort2") && orderType.equals("desc"))
                return o2.val2 - o1.val2;
            return 0;
        });
        for (Animal animal : list) {
            System.out.println(animal.name);
        }
    }

}
