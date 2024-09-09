package com.zhj.linkedlist;


import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月09日 9:56
 * 234. 回文链表
 * 简单
 * 相关标签
 * 相关企业
 * 给你一个单链表的头节点 head ，请你判断该链表是否为
 * 回文链表
 * 。如果是，返回 true ；否则，返回 false 。
 */
public class IsPalindrome {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode p2=head;
        List<Integer> list=new ArrayList<Integer>();
        while(p2!=null)
        {   list.add(p2.val);
            p2=p2.next;
        }
        int n= list.size();
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            if(list.get(i)!=list.get(j))
                return false;
        }
        return true;
    }
}
