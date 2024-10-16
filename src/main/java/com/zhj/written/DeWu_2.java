package com.zhj.written;

import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年10月09日 20:27
 */
public class DeWu_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s=in.nextLine();
        int n=s.length();
        double count=0;
        if(n>1) {
            if (s.charAt(0) == '?') {
                if (s.charAt(1) == ')')
                    count = count + 0.25;
                if (s.charAt(1) == '?')
                    count = count + 0.125;
            } else if (s.charAt(0) == '(') {
                if (s.charAt(1) == ')')
                    count = count + 0.5;
                else if (s.charAt(1) == '?') {
                    count = count +0.25;
                }
            }
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) == '?') {
                    if (s.charAt(i+1) == ')')
                        count = count + 0.25;
                    if (s.charAt(i+1) == '?')
                        count = count + 0.125;
                    if (s.charAt(i-1) == '(')
                        count = count + 0.25;
                    if (s.charAt(i-1) == '?')
                        count = count + 0.125;
                } else if (s.charAt(i) == ')') {
                    if (s.charAt(i-1) == '(')
                        count = count + 0.5;
                    else if (s.charAt(i-1) == '?') {
                        count = count +0.25;
                    }
                } else {
                    if (s.charAt(i+1) == ')')
                        count = count + 0.5;
                    else if (s.charAt(i+1) == '?') {
                        count = count +0.25;
                    }
                }
            }
            if (s.charAt(n-1) == '?') {
                if (s.charAt(n-2) == '(')
                    count = count + 0.25;
                if (s.charAt(n-2) == '?')
                    count = count + 0.125;
            } else if (s.charAt(n-1) == ')') {
                if (s.charAt(n-2) == '(')
                    count = count + 0.5;
                else if (s.charAt(n-2) == '?') {
                    count = count +0.25;
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            count*=2;
            if(count>(1000000000+7))
                count=count%(1000000000+7);
        }
        System.out.println((int)count);
    }
}
