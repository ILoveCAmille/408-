package com.zhj.linkedlist;

import java.util.HashMap;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月09日 10:20
 */
public class LRUCache {
    //没写完
    class ListNode{
        int key;
        int val;
        ListNode next;
        ListNode pre;
        public ListNode() {
        }
        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private HashMap<Integer,ListNode> cache=new HashMap<Integer, ListNode>();
    private int size;
    private final int capacity;
    private ListNode head,tail;
    //构造函数进行初始化任务
    public LRUCache(int capacity) {
        size=0;
        this.capacity=capacity;
        head=new ListNode();
        tail=new ListNode();
        head.next=tail;
        tail.pre=head;
    }

    public int get(int key) {
        ListNode node=cache.get(key);
        if(node==null)
            return -1;
        moveToHead(node);
        return node.val;
    }

    private void moveToHead(ListNode node) {
        removeNode(node);
        addToHead(node);
    }
    private void removeNode(ListNode node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }
    private void addToHead(ListNode node) {
        node.next=head.next;
        head.next=node;
        node.next.pre=node;
        node.pre=head;
    }

    public void put(int key, int value) {
        ListNode node=cache.get(key);
        if(node==null)
        {   ListNode tmpNode=new ListNode(key,value);
            cache.put(key,tmpNode);
            addToHead(tmpNode);
            ++size;
            if(size>capacity)
            {
                ListNode tail=removeTail();
                cache.remove(tail);
                --size;
            }
        }
        else {
            node.val=value;
            moveToHead(node);
        }
    }

    private ListNode removeTail() {
        ListNode tmp=tail.pre;
        removeNode(tmp);
        return tmp;
    }

}
