package com.zhj.written;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2025年03月08日 19:23
 */
public class mt_test_1 {
     static class Employee{
        String name;
        int age;
        String gender;
        String job;
        List<Integer> scores=new ArrayList<>();
    }
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n;
        n=in.nextInt();
        in.nextLine();
        String tmp,tmp1;
        String[] list;
        Employee e=new Employee();
        for(int i=0;i<n;i++)
        {
            tmp=in.nextLine();
            list=tmp.split(" ");
            e.name=list[0];
            e.age=Integer.parseInt(list[1]);
            e.gender=list[2];
            e.job=list[3];
            for(int j=4;j<list.length;j++){
                e.scores.add(Integer.parseInt(list[j]));
            }
            if(e.age<18||e.age>60){
                System.out.println(e.name+" "+"Invalid"+" "+"Age");
            }
            else{
                if(!Objects.equals(e.gender, "M") && !Objects.equals(e.gender, "F")){
                    System.out.println(e.name+" "+"Invalid Gender");
                }
                else{
                    if(!Objects.equals(e.job, "HR") && !Objects.equals(e.job, "IT")&&!Objects.equals(e.job,
                            "Finance")&&!Objects.equals(e.job, "Marketing")){
                        System.out.println(e.name+" "+"Invalid Department");
                    }
                    else{
                            tmp1=e.name;
                            int flag=1,sum=0;
                        for (Integer score : e.scores) {
                            if(score<70)
                            {tmp1=tmp1+" Fail";flag=0;break;}
                        }
                            if(flag==1){
                                tmp1=tmp1+" Pass";
                            }
                        for (Integer score : e.scores) {
                            sum+=score;
                        }
                        if(sum>400){
                            tmp1=tmp1+" Outstanding";
                        } else if (sum>300) {
                            tmp1=tmp1+" Excellent";
                        }
                        else {
                            tmp1=tmp1+" Not Excellent";
                        }
                        System.out.println(tmp1);
                    }
                }
            }
            e.scores.removeAll(e.scores);
        }
    }
}
