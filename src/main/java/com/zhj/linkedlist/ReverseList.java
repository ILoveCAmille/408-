package com.zhj.linkedlist;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 11:07
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0,null);
        ListNode cur=head,tmp;
        while(cur!=null)
        {
            tmp=cur;
            tmp.next=dummy.next;
            dummy.next=tmp;
            cur=cur.next;
        }
        return dummy.next;
    }
}
