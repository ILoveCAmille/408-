package com.zhj;


import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static List<Character> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s;
        while (in.hasNextLine()) {
            res.clear();
            s = new StringBuilder(in.nextLine());
            System.out.printf(s+" -> ");
            System.out.println(reverse(String.valueOf(s)));;
        }
    }
    public static String reverse(String s) {
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            res.add(s.charAt(i));
        }
        Collections.reverse(res);
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            tmp.append(res.get(i));
        }
        return tmp.toString();
    }
}