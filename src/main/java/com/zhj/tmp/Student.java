package com.zhj.tmp;

import java.util.Comparator;
import java.util.Objects;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月17日 9:20
 */
public class Student implements Comparable, Comparator {
    final static int MAX=100;
    private String name;
    private int score;
    public int getMax(){
        return MAX;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public Student(){

    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1!=null&&o2!=null)
        {
            Student s1=(Student) o1;
            Student s2=(Student) o2;
            return s1.score-s2.score;
        }
        return -999;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Object o) {
            if(o!=null)
            {
                Student s=(Student) o;
                if(s.score>=0&&s.score<=100)
                    return this.score-s.score;
            }
            return -999;
    }

    public void BubbleSort(Student[] student){
        Student tmp = student[0];
        for(int i=0;i<student.length-1;i++){
            for(int j=0;j<student.length-1-i;j++){
                if(tmp.compare(student[j],student[j+1])>0){
                    tmp=student[j];
                    student[j]=student[j+1];
                    student[j+1]=tmp;
                }
            }
        }
    }

}
