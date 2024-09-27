package com.zhj.written;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月21日 10:59
 */
public class mt_2 {
    static int max=Integer.MIN_VALUE;
    static int[] visited;
    static List<Integer> a=new ArrayList<>();
    static List<Integer> b=new ArrayList<>();
    static List<Integer> c=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,tmp_value=0,k=0;
        n=in.nextInt();
        m=in.nextInt();
        visited=new int[m];
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            a.add(in.nextInt());
        }
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            b.add(in.nextInt());
        }
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            c.add(in.nextInt());
        }
        //DFS深搜+回溯
        dfs(n,tmp_value,k);
        System.out.println(max);
    }

    private static void dfs(int n, int tmpValue,int k) {
        if(k==n-1)
        {
            max=Math.max(max,tmpValue);
        }
        if(visited[a.get(k)]==0)
        {
            tmpValue+=b.get(k);
            visited[a.get(k)]=1;
            ++k;
        }
        else{
            tmpValue+=c.get(k);
            ++k;
        }
        dfs(n,tmpValue,k);
        if(visited[a.get(k)]==1){
            tmpValue-=b.get(k);
            visited[a.get(k)]=0;
            --k;
        }
        else{
            tmpValue-=c.get(k);
            --k;
        }
    }
}
