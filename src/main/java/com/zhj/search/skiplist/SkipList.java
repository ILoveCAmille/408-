package com.zhj.search.skiplist;

import java.util.Random;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月19日 16:42
 */

public class SkipList {

    Node head,tail;

      int MAX_LEVEL;

     public int randLevel(SkipList s){
         int level =1;
         double p=1.0/2.0;
         while(Math.random()<p)level+=1;
         return Math.min(level,s.MAX_LEVEL);
     }

    public Node find(SkipList s,int x){
        Node p=s.head;
        while(p!=null&&p.getKey()!=x){
            if(p.next.getKey()<=x) p=p.getNext();
            else p=p.down;
        }
        return p;
    }

    public void insert(SkipList s,int x){
        int level=randLevel(s);
        while(s.head.getLevel()+1<level) s.head=s.head.up;
        Node p=s.head;
        Node node=Node.getNewNode(x,level);
        while(p.getLevel()!=node.getLevel()) p=p.down;
        while(p!=null)
        {
            while(p.next.getKey()<node.getKey()) p=p.next;
            node.next=p.next;
            p.next=node;
            p=p.down;
        }
        return;
    }

    public SkipList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public static SkipList getNewSkipList(int n){
        SkipList s=new SkipList(null,null);
        s.head=Node.getNewNode(Integer.MAX_VALUE,n);
        s.tail=Node.getNewNode(Integer.MIN_VALUE,n);
        Node p=s.head,q=s.tail;
        while(p!=null){
            p.next=q;
            p=p.down;q=q.down;
        }
        s.MAX_LEVEL=n;
        while(s.head.getLevel()!=0) s.head=s.head.down;
        return s;
    }
    public void clearNode(Node p){
        if(p==null) return;
        p=null;
        System.gc();
    }
    public void clearSkipList(SkipList s){
        Node p=s.head,q;
        while(p.getLevel()!=0) p=p.down;
        while(p!=null)
        {
            q=p.next;
            clearNode(p);
            p=q;
        }
        s=null;
        System.gc();
    }

    public void output(SkipList s) {
         Node p=s.head;
         while(p.getLevel()!=0) p=p.down;
         while(p!=null)
         {
            for(Node q=p;q!=null;q=q.up)
            {
                System.out.printf("%-4d",q.getKey());
            }
             System.out.println();
         }
    }
}
